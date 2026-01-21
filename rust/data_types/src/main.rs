fn main() {
    let x = 34.3234; // f64
    let x: f32 = 982.23; // f32

    // numeric operations
    let sum = 5 + 10;
    let difference = 95.5 - 4.3;
    let product = 4 * 30;

    let quotient = 56.7 / 32.2;
    let truncated = -5 / 3;

    let remainder = 43 % 5;

    // character types
    let c = 'a';
    let c: char = 'F';
    let strong_emoji = '💪';
    println!("{strong_emoji}");

    // compound types - tuple
    let mut tup: (i64, f32, u8) = (5, 2.0, 15);
    let (_x, _y, _z) = tup; // destructuring
    let index_access = tup.2;
    println!("Initial Tuple Index : {index_access}");

    // updating tuple
    tup.2 += 5;
    let updated_index = tup.2;
    println!("Tuple updated : {updated_index}");

    let array = [1, 2, 3, 4, 10];
    println!("Array : {:?}", array);

    let fixed_array: [i32; 3];
    fixed_array = [1, 2, 3];
    println!("Fixed Array : {:?}", fixed_array);

    let duplicate_array = [-1; 5];
    println!("Duplicate Array : {:?}", duplicate_array);
}
