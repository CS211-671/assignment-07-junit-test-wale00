package ku.cs.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserListTest {

    @Test
    @DisplayName("User should be found in UserList")
    public void testUserListFindUser() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        User user1 = new User("user1", "password1");
        User user2 = new User("user2", "password2");
        User user3 = new User("user3", "password3");
        userList.addUser(user1);
        userList.addUser(user2);
        userList.addUser(user3);

        // TODO: find one of them
        User foundUser = userList.findUser("user2");

        // TODO: assert that UserList found User
        String expected = "user2";
        String actual = foundUser.getUsername();
        assertEquals(expected, actual);
        // String expected = "<one of username>";
        // String actual = user.getUsername();
        // assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User can change password")
    public void testUserCanChangePassword() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        User user1 = new User("user1", "password1");
        User user2 = new User("user2", "password2");
        User user3 = new User("user3", "password3");
        userList.addUser(user1);
        userList.addUser(user2);
        userList.addUser(user3);


        // TODO: change password of one user
        user.changePassword("newPassword");

        // TODO: assert that user can change password
        String expected = "newPassword";
        String actual = user1.getHashedPassword();
        assertEquals(expected, actual);
        // assertTrue(actual);
    }

    @Test
    @DisplayName("User with correct password can login")
    public void testUserListShouldReturnObjectIfUsernameAndPasswordIsCorrect() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        User user1 = new User("user1", "password1");
        userList.addUser(user1);

        // TODO: call login() with correct username and password
        User actual = userList.login("user1", "password1");
        // TODO: assert that User object is found
        assertNotNull(actual);
        // assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User with incorrect password cannot login")
    public void testUserListShouldReturnNullIfUsernameAndPasswordIsIncorrect() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        User user1 = new User("user1", "password1");
        userList.addUser(user1);

        // TODO: call login() with incorrect username or incorrect password
        User actual = userList.login("user1", "wrongPassword");
        // TODO: assert that the method return null
        assertNull(actual);
        // assertNull(actual);
    }

}