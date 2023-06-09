package conexion;

import java.sql.*;

public class conexion {
    private static conexion instancia = null;
    private static String url = "jdbc:mysql://localhost:3306/angel";
    private static String user = "root";
    private static String pass = "";
    private static Connection con = null;
    private Statement stmt = null;

    public conexion() throws SQLException, ClassNotFoundException {
        System.out.println("Conectando...");
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection(url, user, pass);
        stmt = con.createStatement();
        System.out.println(con);
        System.out.println("Conectado");
    }

    public static conexion obtenerInstancia() throws SQLException, ClassNotFoundException {
        if (instancia == null) {
            instancia = new conexion();
        }
        return instancia;
    }



	public Connection getConexion()
	//Permite retornar la conexion
	{
		return con;
	}
        
 	public int CerrarConexion()
	{
		try
		{
			con.close(); 
			return 0;
		}
		catch(Exception exc)
		{
			System.out.println("Error al cerrar la conexion: "+" : "+exc);
			return -1;
		}
	}

	public void close(){
	      try
	      {
	          if (con != null)
	          {
	              stmt.close();
	              con.close();
	              con = null;
	          }
	      }
	      catch (SQLException sqe)
	      {
	          System.out.println("Unexpected exception : " +
	              sqe.toString() + ", sqlstate = " + sqe.getSQLState());
	          sqe.printStackTrace();
	      }
	  }    
        public Connection conexion(){
		return con;
	}
        
	public Statement sentencia(){
		return stmt;
	}        

}