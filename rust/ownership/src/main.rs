mod utils;

fn main() {
    utils::slicing();
    println!(
        "Sliced String - {}",
        utils::slicing_with_limit(&String::from("devkhishan"), 5)
    );
}
