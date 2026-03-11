#![allow(dead_code)]

pub fn slicing() {
    let str: String = String::from("hello world");
    println!("First 5 chars - {}", &str[0..5]);
}

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
