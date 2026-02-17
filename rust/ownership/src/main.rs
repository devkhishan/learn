fn main() {
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
