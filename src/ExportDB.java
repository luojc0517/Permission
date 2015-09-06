

import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class ExportDB {
	
	public static void main(String[] args) {
		
		try {
		
			Configuration cgf = new Configuration().configure();
			
			SchemaExport export = new SchemaExport(cgf);
			
			export.create(true, true);
		
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
			
		}
	}

}
