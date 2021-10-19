package com.tong.t20211018;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class DistinctByMultiFields {

    public static void main(String[] args) {
        List<Record> recordsList = getRecords();

        List<Record> list = recordsList.stream()
                .filter(distinctByKeys(Record::getId, Record::getName))
                .collect(Collectors.toList());

        System.out.println(list);
    }

    private static <T> Predicate<T> distinctByKeys(Function<? super T, ?>... keyExtractors)
    {
        final Map<List<?>, Boolean> seen = new ConcurrentHashMap<>();

        return t ->
        {
            final List<?> keys = Arrays.stream(keyExtractors)
                    .map(ke -> ke.apply(t))
                    .collect(Collectors.toList());

            return seen.putIfAbsent(keys, Boolean.TRUE) == null;
        };
    }


    private static ArrayList<Record> getRecords()
    {
        ArrayList<Record> records = new ArrayList<>();

        records.add(new Record(1l, 10l, "record1", "record1@email.com", "India"));
        records.add(new Record(1l, 20l, "record1", "record1@email.com", "India"));
        records.add(new Record(2l, 30l, "record2", "record2@email.com", "India"));
        records.add(new Record(2l, 40l, "record2", "record2@email.com", "India"));
        records.add(new Record(3l, 50l, "record3", "record3@email.com", "India"));

        return records;
    }

    public static class Record {
        private long id;
        private long count;
        private String name;
        private String email;
        private String location;

        public Record(long id, long count, String name,
                      String email, String location) {
            super();
            this.id = id;
            this.count = count;
            this.name = name;
            this.email = email;
            this.location = location;
        }

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public long getCount() {
            return count;
        }

        public void setCount(long count) {
            this.count = count;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        @Override
        public String toString() {
            return "Record [id=" + id + ", count=" + count + ", name=" + name +
                    ", email=" + email + ", location="
                    + location + "]";
        }
    }
}
