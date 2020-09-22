package dao.JDBC;

import dao.LocomotiveDAOInter;
import model.Locomotive;
import util.ConnectionUtil;

import java.io.IOException;
import java.sql.SQLException;

import static util.ConnectionUtil.connection;
import static util.ConnectionUtil.preparedStatement;

public class LocomotiveDAOIml implements LocomotiveDAOInter {

    @Override
    public Locomotive getEntityById(Long id) {
        return null;
    }

    @Override
    public void saveEntity(Locomotive locomotive) throws IOException {

    }

    @Override
    public void updateEntity(Locomotive entity) {

    }

    @Override
    public void removeEntity(Locomotive entity) {

    }
}
