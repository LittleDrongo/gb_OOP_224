package main.clients;

public class Owner {
    String fullName;

    public Owner(String fullName) {
        this.fullName = fullName;
    }


    @Override
    public String toString() {
        return "Owner{" +
                "fullName='" + fullName + '\'' +
                '}';
    }
}

