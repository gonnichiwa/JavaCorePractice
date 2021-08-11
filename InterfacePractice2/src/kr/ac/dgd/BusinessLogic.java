package kr.ac.dgd;



public class Main {

    public static void main(String[] args) {
        System.out.println("interfacePractice2");
        // 274 ~ 275p
        Connector oracleConnector = ConnectorFactory.getConnector("oracle");
        oracleConnector.connect();
        Connector mysqlConnector = ConnectorFactory.getConnector("mysql");
        mysqlConnector.connect();
    }
}











class OracleConnector implements Connector {
    @Override
    public void connect() {
        System.out.println("오라클 연결됨");
    }
}

class MySQLConnector implements Connector {
    @Override
    public void connect() {
        System.out.println("mySQL 연결됨");
    }
}



class ConnectorFactory {
    public static Connector getConnector(String dbmsName) {
        Connector connector = null;
        if(dbmsName.contentEquals("oracle")){
            connector = new OracleConnector();
        } else if (dbmsName.contentEquals("mysql")) {
            connector = new MySQLConnector();
        }
        return connector;
    }
}