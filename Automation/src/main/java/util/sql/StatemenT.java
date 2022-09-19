package util.sql;

import data.Person;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class StatemenT {
    private Statement statement;

    public StatemenT() throws SQLException {
        makeStatemenT();
    }

    public Statement makeStatemenT() throws SQLException {
        Connectt c = null;

        c = new Connectt();
        Connection conn = c.makeConnection();
        statement = conn.createStatement();
        return statement;
    }

    public void selectByUserNameEmail(String name, String email) {
        String s = "SELECT * FROM sys.user where name=\"" + name + "\" and email=\"" + email + "\"";
        try {
            ResultSet resultSet = statement.executeQuery(s);//запрос с ответом resultset(ответ)
            resultSet.next();
            System.out.println(resultSet.getString("name"));
            System.out.println(resultSet.getString("password"));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void selectUsersByName(String Name) {
        String s = "SELECT * FROM sys.user where name=\"" + Name + "\"";
        try {
            ResultSet resultSet = statement.executeQuery(s);
            while (resultSet.next()) {
                System.out.println(resultSet.getString("password"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Person getUserById(String id) { //Homework17
        String query = "SELECT * FROM sys.user where id=\"" + id + "\"";
        Person person = null;
        try {
            ResultSet resultSet = statement.executeQuery(query);
            resultSet.next();
            person = new Person(
                    resultSet.getString("name"),
                    resultSet.getString("email"),
                    resultSet.getString("password"),
                    resultSet.getString("id"));

            System.out.println(person.getName());

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return person;
    }

    public void insert(String name, String password, String email) {
        UUID uuid = UUID.randomUUID();
        String s = "INSERT INTO `sys`.`user` (`name`, `email`, `password`, `id`) VALUES (\"" + name + "\",\"" +
                email + "\"" + ",\"" + password + "\",\"" + uuid.toString() + "\");";
        try {
            statement.execute(s);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void insert(String name, String password, String email, String id) {
        String s = "INSERT INTO `sys`.`user` (`name`, `email`, `password`, `id`) VALUES (\"" + name + "\",\"" +
                email + "\"" + ",\"" + password + "\",\"" + id + "\");";
        //System.out.println(s);
        try {
            statement.execute(s);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void delete(String id) {
        //DELETE FROM `sys`.`user` WHERE (`id` = '62028969-a6ed-4a17-b546-0d73743f64b7');
        String s = "DELETE FROM `sys`.`user` WHERE (`id` = '" + id + "');";
        try {
            statement.execute(s);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    //    public USER selectfromID(String UUID) throws SQLException {
//        String s="SELECT * FROM sys.user WHERE `id`=\""+UUID+"\";";
//        ResultSet resultSet=statement.executeQuery(s);
//        resultSet.next();
//        return new USER(resultSet.getString("name"),
//                        resultSet.getString("password"),
//                        resultSet.getString("email"),
//                        resultSet.getString("createtime"),
//                        resultSet.getString("id"));
//    }
    public List<Person> getListAllUsers() throws SQLException {
        String s = "SELECT * FROM sys.user;";
        ResultSet resultSet = statement.executeQuery(s);
        List<Person> users = new ArrayList<>();
        while (resultSet.next()) {
            users.add(new Person(resultSet.getString("name"),
                    resultSet.getString("password"),
                    resultSet.getString("email"),
                    resultSet.getString("id")));
        }

        return users;
    }

    public void selectSameEmailUser(String email) { //Homework17
        String s = "SELECT id, name, email FROM sys.user WHERE email = \"" + email + "\";";
        try {
            ResultSet resultSet = statement.executeQuery(s);
            while (resultSet.next()) {
                String result = String.format("%s %s %s",
                        resultSet.getString("id"),
                        resultSet.getString("name"),
                        resultSet.getString("email"));
                System.out.println(result);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void updatePasswordById(String password, String id) { //Homework17
        String s = "UPDATE `sys`.`user` SET `password` = \"" + password + "\" WHERE (`id` = \"" + id + "\")";
        try {
            statement.execute(s);
            System.out.println("Password has been changed.");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
