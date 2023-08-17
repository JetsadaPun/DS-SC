package SoftwareCon2_2;

class Boss {
    static String Shout() {
        return "Hi, baby";
    }
}

class Slave extends Boss {
    static String Shout() {
        // @Override
        return "Goodbye !";
    }
}
