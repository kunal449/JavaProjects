import de.fhpotsdam.unfolding.UnfoldingMap;
import de.fhpotsdam.unfolding.geo.Location;
import de.fhpotsdam.unfolding.providers.Google;
import de.fhpotsdam.unfolding.utils.MapUtils;
import processing.core.PApplet;

/***
 * A simple Applet to draw a map, using UnfoldingMap library.
 * @author Kunal
 *	Date : 10/08/2016
 */
public class HelloMaps extends PApplet{
	UnfoldingMap map;
	@Override
	public void setup() {
		//Set the size of window
		size(1000,800);
		
		map = new UnfoldingMap(this, new Google.GoogleTerrainProvider());
		//Define the default location and zoom-in level when the map loads.
		map.zoomAndPanTo(15, new Location(20.0471, 74.4820));
		//This line makes maps interactive.
		MapUtils.createDefaultEventDispatcher(this, map);
	}
	@Override
	public void draw() {
		//Set the background color 
		background(0);
		map.draw();
	}
}
