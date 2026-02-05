fn main() {
    let number = 3;
    if number > 5 {
        println!("Number is greater than 5");
    } else {
        println!("Number is lesser than or equal to 5");
    }

    let mut counter = 0;

    let result = loop {
        counter += 1;

        if counter == 10 {
            break counter * 2;
        }
    };

    println!("The result is {result}");
}
