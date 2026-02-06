use std::io;

fn main() {
    //let counter = 0;
    // let number = 3;
    /*

        if number > 5 {
            println!("Number is greater than 5");
        } else {
            println!("Number is lesser than or equal to 5");
        }

        let result = loop {
            counter += 1;

            if counter == 10 {
                break counter * 2;
            }
        };

        println!("The result is {result}");

        let boolean: bool = true;
        let value = if boolean { 5 } else { 2 };
        println!("Ternary {value}");

        'count: loop {
            let mut inner_counter = 0;
            counter += 1;
            println!("Counter: {counter}");
            loop {
                inner_counter += 1;
                println!("Inner Counter: {inner_counter}");
                if inner_counter == 10 {
                    break;
                }
                if counter == 2 {
                    break 'count;
                }
            }
        }
    */
    for number in (1..4).rev() {
        println!("Current: {number}");
    }
}
