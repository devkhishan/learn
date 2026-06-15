#![allow(dead_code)]

pub fn slicing_with_limit(s: &String, n: usize) -> &str {
    &s[0..n]
}

pub fn referencing() {
    let x: Box<i32> = Box::new(-1);
    let b: &i32 = &x;
    let r1 = &b;
    println!("Explicit Double Dereference: {}", r1.abs()); // explicit double dereference
    let str: String = String::from("hello");
    let refstr = str::len(&str); // implicit reference
    println!("Implicit Reference: {refstr}");
    let strref = str.len(); // explicit reference
    println!("Explicit Reference: {strref}");
}

pub fn ownership() {
    // --- Ownership Rules ---
    // 1. Each value in Rust has a variable that's called its owner.
    // 2. There can only be one owner at a time
    // 3. When the owner goes out of scope, the value will be dropped.

    let x = 10;
    let y = x; // This is a copy => i32, &str, bool, char - has copy trait by default
    print!("Copy Trait = {}", y);

    let stack_str = "stack"; // Type : &str (String literal) - stored in stack as binary - fixed
    let copy_stack_str = stack_str;
    println!("Original Stack String = {}", stack_str);
    println!("Copied Stack String = {}", copy_stack_str);

    let heap_str = String::from("heap"); // Type : String - stored in heap - dynamic
    let moved_heap_str = heap_str;
    // println!("Original Heap String = {}", heap_str); -> This throws error : Borrow of moved value.
    println!("Moved Heap String = {}", moved_heap_str); // The Ownership is moved from heap_str -> moved_heap_str
}

pub fn reference_and_borrowing() {
    // --- Rules of Reference ---
    // 1. At any given time, you can have either have one mutable reference or any number of immutable references.
    // 2. References must always be valid.
    let mut s = String::from("hello");

    // let r1 = &mut s; -> First Mutable Reference
    // let r2 = &mut s; -> Error : You cannot have more than one mutable reference to avoid race condition

    let r1 = &s;
    let r2 = &s; // you can have multiple immutable references.
    // let r3 = &mut s; -> Error : you cannot have mutable and immutable reference simultaneously.

    println!("{}, {}", r1, r2); // The scope of r1 and r2 ends here

    let r3 = &mut s; // As the scope of immutable references ends already, we can create a mutable reference.
    println!("{}", r3);
}

/* pub fn dangle() -> &String { -> Error : there is no value to be borrowed from.
    let s = String::from("dangle");
    &s
} */
// The scope of s ends here - therefore, rust drops it. Hence, its reference cannot point to any memory.

pub fn slicing() {
    let s = String::from("hello world");
    let hello = &s[..5]; // It is borrowed as immutable reference here.
    // s.clear(); -> Error : cannot borrow as mutable, because it is already borrowed as immutable.
    println!("{}", hello);

    // Slicing are not only for Strings
    // let a: [i32; _] = [1, 2, 3, 4, 5];
    // let slice: &[i32] = &a[..3];
}
