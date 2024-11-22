package HotelService;

import java.util.HashSet;
import java.util.Set;

public class UserManagementService {
    private final Set<String> registeredUsers = new HashSet<>();

    public void registerUser(String username) {
        if (registeredUsers.add(username)) {
            System.out.println("User " + username + " registered successfully.");
        } else {
            System.out.println("Username already taken.");
        }
    }

    public boolean login(String username) {
        return registeredUsers.contains(username);
    }
}

