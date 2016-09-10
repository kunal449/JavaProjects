import de.fhpotsdam.unfolding.UnfoldingMap;
import de.fhpotsdam.unfolding.geo.Location;
import de.fhpotsdam.unfolding.providers.Google;
import de.fhpotsdam.unfolding.utils.MapUtils;
import processing.core.PApplet;

public class HelloMaps extends PApplet{
	UnfoldingMap map;
	@Override
	public void setup() {
		size(1000,800);
		
		map = new UnfoldingMap(this, new Google.GoogleTerrainProvider());
		map.zoomAndPanTo(15, new Location(20.0471, 74.4820));
		MapUtils.createDefaultEventDispatcher(this, map);
	}
	@Override
	public void draw() {
		background(0);
		map.draw();
	}
}
