package comPackageTestCase;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.Point3D;
import com.Polygon3D;
import com.Renderer3D;

public class ClassesTest3D {

	Point3D point3D = new Point3D(1, 2, 3, 4, 5, 7, 8, 9);
	Polygon3D  polygon3D = new Polygon3D(8);
	Renderer3D renderer3D = new Renderer3D();
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

	
	
}
