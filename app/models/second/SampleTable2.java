package models.second;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.avaje.ebean.Model;

@Entity()
public class SampleTable2 extends Model {

	@Id
	public Integer sampleTable2Id;

	public String sampleTable2Value;

	public static Find<Integer, SampleTable2> find = new Find<Integer, SampleTable2>(){};

}
