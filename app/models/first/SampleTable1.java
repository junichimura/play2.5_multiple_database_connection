package models.first;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SampleTable1 extends Model {

	@Id
	public Integer sampleTable1Id;

	public String sampleTable1Value;

	public static Find<Integer, SampleTable1> find = new Find<Integer, SampleTable1>(Model.server, SampleTable1.class){};

}
