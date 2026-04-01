use itertools::Itertools;

fn main() {
    let numbers = vec![10, 5, 8, 3, 1];

    let sorted_numbers: Vec<i32> = numbers.into_iter().sorted_by_key(|&x| x).collect();

    println!("{:?}", sorted_numbers);
}
