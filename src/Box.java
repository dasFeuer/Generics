///  Now we will make Box Generic class, but before that we will study Generic Types.
/// Generic types allow you to define a class, interface, or method with placeholders
/// (type parameters) for the data types they will work with. This enables code reusability and type safety,
/// as it allows you to create classes, interfaces, or methods that can operate on various types without needing to rewrite the code for each type.
/// A generic type is a class or interface that is parameterized over types.
/// For example, a generic class can work with any type specified by the user, and that type can be enforced at compile time.
///
/// The syntax for a generic type is:
public class Box<T> {
    /// one or more type parameters
/// These type parameters are placeholders that are replaced with specific types when the class is instantiated.

    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    /*
    Where T is the type parameter, which can be any valid identifier. Conventionally,
    single-letter names are used for type parameters, such as T for Type, E for Element, K for Key, V for Value, etc.

    Here, Box<T> is a generic class. The type parameter T will be replaced with a specific
    type when an object of Box is created. Now, the Box class is type-safe, and we will not encounter
    the ClassCastException because the types are enforced at compile time.

    So, In simpler terms, generics allow you to write code that can work with any object type
    while ensuring type safety at compile time.

    Generics help us write more flexible and reusable code.
    For example, without generics, we would have to write multiple versions of the same class to handle different data types, leading to code duplication.
     */


}
