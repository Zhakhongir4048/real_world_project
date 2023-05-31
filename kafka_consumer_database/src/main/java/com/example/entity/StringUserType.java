package com.example.entity;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.usertype.UserType;

import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StringUserType implements UserType<String> {
    @Override
    public int getSqlType() {
        return 0;
    }

    @Override
    public Class<String> returnedClass() {
        return String.class;
    }

    @Override
    public boolean equals(String x, String y) {
        return false;
    }

    @Override
    public int hashCode(String x) {
        return 0;
    }

    @Override
    public String nullSafeGet(ResultSet rs, int position, SharedSessionContractImplementor session, Object owner) throws SQLException {
        return null;
    }

    @Override
    public void nullSafeSet(PreparedStatement st, String value, int index, SharedSessionContractImplementor session) throws SQLException {

    }

    @Override
    public String deepCopy(String value) {
        return null;
    }

    @Override
    public boolean isMutable() {
        return false;
    }

    @Override
    public Serializable disassemble(String value) {
        return null;
    }

    @Override
    public String assemble(Serializable cached, Object owner) {
        return null;
    }
}
