package models.first;

import javax.persistence.MappedSuperclass;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.EbeanServer;
import com.avaje.ebean.bean.EntityBean;

@MappedSuperclass
public abstract class Model extends com.avaje.ebean.Model {

	// application.conf に記載のサーバを指定する。
	public static final String server = "first";

	public static EbeanServer db() {
		return Ebean.getServer(server);
	}

	public void markAsDirty() {
		db().markAsDirty(this);
	}

	public void markPropertyUnset(String propertyName) {
		((EntityBean) this)._ebean_getIntercept().setPropertyLoaded(propertyName, false);
	}

	public void save() {
		db().save(this);
	}

	public void update() {
		db().update(this);
	}

	public void insert() {
		db().insert(this);
	}

	public boolean delete() {
		return db().delete(this);
	}

	public void update(String server) {
		db(server).update(this);
	}

	public void insert(String server) {
		db(server).insert(this);
	}

	public boolean delete(String server) {
		return db(server).delete(this);
	}

	public void refresh() {
		db().refresh(this);
	}

}
