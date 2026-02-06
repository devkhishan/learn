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

    for number in (1..4).rev() {
        println!("Current: {number}");
    }
    */
    let mut n = String::new();
    io::stdin().read_line(&mut n).expect("failed input");
    // 0 1 1 2 3
    let mut n: i64 = n.trim().parse().unwrap();
    let val = n;
    let mut f = 0;
    let mut s = 1;
    let ans = if n == 1 {
        f
    } else {
        if n == 2 {
            s
        } else {
            n -= 2;
            while n != 0 {
                let val = f + s;
                f = s;
                s = val;
                n -= 1;
                println!("{s}");
            }
            s
        }
    };
    println!("{val} fibonacci no.: {ans}");
}
