package SoftwareCon2_1;

class Boss {
    String Shout() {
        return "Hi, Baby";
    }
}

class Slave extends Boss {
    // @Override
    String Shout() {
        return "Goodbye !";
    }
}