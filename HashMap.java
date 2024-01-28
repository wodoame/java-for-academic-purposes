// In Java, the equivalent of a hashmap is the `HashMap` class, which is part of the Java Collections Framework.
// The `HashMap` class allows you to store key-value pairs, where each key is associated with a specific value.
// Here's a basic example of how to use `HashMap` in Java:


import java.util.HashMap;

public class ExampleHashMap {
    public static void main(String[] args) {
        // Creating a HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Adding key-value pairs to the HashMap
        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        hashMap.put("Three", 3);

        // Accessing values using keys
        int valueOfTwo = hashMap.get("Two");
        System.out.println("Value associated with key 'Two': " + valueOfTwo);

        // Iterating over the key-value pairs in the HashMap
        for (String key : hashMap.keySet()) {
            int value = hashMap.get(key);
            System.out.println("Key: " + key + ", Value: " + value);
        }
    }
}


// In this example, we create a `HashMap` with `String` keys and `Integer` values.
// We add key-value pairs using the `put` method, retrieve values using the `get` method, and iterate over the entries using `keySet`.
// Note that `HashMap` allows you to store and retrieve values based on their keys, and it doesn't allow duplicate keys.
// If you need thread-safe operations, you can use `ConcurrentHashMap` or synchronize access to the `HashMap` using external synchronization.

// The `HashMap` class in Java provides a variety of methods for working with key-value pairs. Here are some additional methods of the `HashMap` class:

// 1. **Size-related Methods:**
//    - `int size()`: Returns the number of key-value mappings in the `HashMap`.
//    - `boolean isEmpty()`: Returns `true` if the `HashMap` is empty, `false` otherwise.

System.out.println("Size of the HashMap: " + hashMap.size());
System.out.println("Is the HashMap empty? " + hashMap.isEmpty());


// 2. **Key-related Methods:**
//    - `boolean containsKey(Object key)`: Returns `true` if the `HashMap` contains the specified key.
//    - `Set<K> keySet()`: Returns a `Set` view of the keys contained in the `HashMap`.
//    - `V getOrDefault(Object key, V defaultValue)`: Returns the value to which the specified key is mapped, or a default value if the key is not present.

boolean containsKeyTwo = hashMap.containsKey("Two");
System.out.println("Does the HashMap contain key 'Two'? " + containsKeyTwo);

Set<String> keys = hashMap.keySet();
System.out.println("Keys in the HashMap: " + keys);

int valueOrDefault = hashMap.getOrDefault("Four", 4);
System.out.println("Value for key 'Four' (or default): " + valueOrDefault);


// 3. **Value-related Methods:**
//    - `boolean containsValue(Object value)`: Returns `true` if the `HashMap` contains the specified value.
//    - `Collection<V> values()`: Returns a `Collection` view of the values contained in the `HashMap`.


boolean containsValueThree = hashMap.containsValue(3);
System.out.println("Does the HashMap contain value 3? " + containsValueThree);

Collection<Integer> values = hashMap.values();
System.out.println("Values in the HashMap: " + values);

// 4. **Modification and Removal Methods:**
//    - `V put(K key, V value)`: Associates the specified value with the specified key in the `HashMap`.
//    - `void putAll(Map<? extends K, ? extends V> m)`: Copies all of the mappings from the specified map to the `HashMap`.
//    - `V remove(Object key)`: Removes the mapping for the specified key from the `HashMap`.
//    - `void clear()`: Removes all of the mappings from the `HashMap`.


hashMap.put("Four", 4);
System.out.println("HashMap after adding key-value pair: " + hashMap);

HashMap<String, Integer> anotherMap = new HashMap<>();
anotherMap.put("Five", 5);
anotherMap.put("Six", 6);
hashMap.putAll(anotherMap);
System.out.println("HashMap after adding another map: " + hashMap);

hashMap.remove("Three");
System.out.println("HashMap after removing key 'Three': " + hashMap);

hashMap.clear();
System.out.println("HashMap after clearing: " + hashMap);


// These are just some of the commonly used methods of the `HashMap` class in Java.
// There are more methods and features available in the Java documentation, depending on your specific use case and requirements.
