package demo;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import Recursos.HibernateUtil;
import modelos.Autor;
import modelos.Manga;

public class Demo {
	public static void main(String[] args) {
		Transaction t = null;
		try(Session session = HibernateUtil.getSessionFactory().openSession()){     
			t = session.beginTransaction();
			Autor a = new Autor("Masashi","Kishimoto",50,"Masashi@xtec.cat");
			ArrayList<String> generos = new ArrayList<String>();
			generos.add("Shonen");
			Manga m= new Manga("Naruto",generos,a);
			
			
			
			session.save(a);
			session.save(m);
			t.commit();
		}catch(Exception e2) {
			e2.printStackTrace();
		}
	}
}
