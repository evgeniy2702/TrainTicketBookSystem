package dao.JDBC;

import dao.PassengerDAOInter;
import model.Passenger;
import util.ConnectionUtil;

import java.io.IOException;
import java.sql.SQLException;

import static util.ConnectionUtil.*;

public class PassengerDAOIml implements PassengerDAOInter {

    private static final String INSERT = "INSERT INTO passenger(passenger_name, age) VALUE (?,?)";


    public PassengerDAOIml() {
        try {
            getConnection();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Passenger getEntityById(Long id) {
        return null;
    }

    @Override
    public void saveEntity(Passenger passenger) throws IOException {

        try {
            preparedStatement = connection.prepareStatement(INSERT);
            preparedStatement.setString(1, passenger.getFirstNamePassenger());
            preparedStatement.setString(2, passenger.getSecondNamePassenger());
            preparedStatement.executeUpdate();
            closePreparedStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateEntity(Passenger entity) {

    }

    @Override
    public void removeEntity(Passenger entity) {

    }
}
