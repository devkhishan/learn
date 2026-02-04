fn main() {
    another_function();
    let addition = add(10, 12);
    println!("Addition : {addition}");
}

fn another_function() {
    println!("Printing from another method");
}

fn add(x: usize, y: usize) -> usize {
    x + y
}
