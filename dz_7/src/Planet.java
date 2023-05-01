public enum Planet {

    MERCURY(1, 0, 57.91, 2440.0, null),
    VENUS(2, 108.2, 0, 6051.8, MERCURY),
    EARTH(3, 150.2, 0, 6384.52, VENUS),
    MARS(4, 250.5, 0, 3385.23, EARTH),
    JUPITER(5, 800.2, 0, 69213.82, MARS),
    SATURN(6, 1520.6, 0, 58421.54, JUPITER),
    URANUS(7, 2900.52, 0, 29741.02, SATURN),
    NEPTUNE(8, 4952.54, 0, 5449.42, URANUS);


    private final int planetNumber;
    private final double distanceFromPrevPlanet;

    private double distanceFromSun;

    private final double radius;
    private final Planet previousPlanet;


    Planet(int planetNumber, double distanceFromPrevPlanet,  double distanceFromSun, double radius, Planet previousPlanet) {
        this.planetNumber = planetNumber;
        this.distanceFromPrevPlanet = distanceFromPrevPlanet;
        this.distanceFromSun = previousPlanet != null? previousPlanet.getDistanceFromSun() + distanceFromPrevPlanet: distanceFromSun;
        this.radius = radius;
        this.previousPlanet = previousPlanet;


    }

    public int getPlanetNumber() {
        return planetNumber;
    }

    public double getDistanceFromPrevPlanet() {
        return distanceFromPrevPlanet;
    }


    public double getDistanceFromSun() {
        return distanceFromSun;
    }


    public double getRadius() {
        return radius;
    }

    public Planet getPreviousPlanet() {
        return previousPlanet;
    }


}
