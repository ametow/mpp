package lesson10.lecture.DataAccess.src.dataaccess.intface;
import dataaccess.*;
public class DataAccessFactory {
	public static DataAccess newDataAccess() {
		return new DataAccessSubsystemFacade();
	}
}
