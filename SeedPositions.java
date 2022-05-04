package application;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;


public class SeedPositions {

    private List<Point> seedsPoints;
    
    public int totalSeeds;
    public List<Point> currentPoints;
    public double canvasWidth, canvasHeight, seedsDiameter;
    
    /**
     * The Seed Position object constructor...
     */
    public SeedPositions() {
        seedsPoints = new ArrayList<Point>();
        currentPoints = new ArrayList<Point>();
    }
    
    public List<Point> getPositions(){
        return this.getPositions(totalSeeds, false);
    }
    
    public List<Point> getPositions(int seeds, boolean random) {
        List<Point> result = new ArrayList<Point>();
        if (seeds <= 5) {
            switch(seeds){
                case 1:
	                getResult1Seed(result, random);
					break;

                case 2:
	                getResult2Seeds(result, random);
	                break;

                case 3:
	                getResult3Seeds(result, random);
	                break;

                case 4:
	                getResult4Seeds(result, random);
	                break;

                case 5:
	                getResult5Seeds(result, random);
	                break;

				default:
					break;
            }
        } else {
            if (currentPoints.isEmpty()) {
                result.addAll(get5SeedsPos(random));
                result.addAll(getPositions(seeds - 5, true));
                currentPoints = result;
            } else {
                if (seeds == currentPoints.size()) {
                    result = currentPoints;  
                } else if (seeds < currentPoints.size()) {
                    int diff = currentPoints.size() - seeds;
                    for (int i = 0; i < diff; ++i) {
                        currentPoints.remove((currentPoints.size() - i));
                    }
                    result = currentPoints;
                } else if (seeds > currentPoints.size()) {
                    int diff = seeds - currentPoints.size();
                    for (int i = 0; i < diff; ++i) {
                        currentPoints.add(getRandomSeedPos());
                    }
                    result = currentPoints;
                }
            }
        }
        return result;  
    }

    /**
     * Will get the position to draw the seeds.. with some maths random thrown into the mix
     * @param random
     * @return seedsPoints
     */
    protected List<Point> get1SeedPos(boolean random) {
        int x, y;
        seedsPoints.clear();    // removes all positions from the list...
        x = (int)((canvasWidth - seedsDiameter) / 2);
        y = (int)((canvasHeight - seedsDiameter) / 2);
        
        if (random) {
            x += (Math.random()* canvasWidth * 0.1);
            y += (Math.random()* canvasHeight * 0.1);
        }
        seedsPoints.add(new Point(x,y));
        return seedsPoints; 
    }
    
    /**
     * Will get the position to draw the seeds.. with some maths random thrown into the mix
     * @param random
     * @return seedsPoints
     */
    protected List<Point> get2SeedsPos(boolean random){
        int x, y;
        seedsPoints.clear();    // removes all positions from the list 
        x = (int)((canvasWidth - ((seedsDiameter * 2) + 15)) / 2);
        y = (int)((canvasHeight - seedsDiameter) / 2);
        seedsPoints.add(new Point(x, y));
        x += seedsDiameter + 15;
        seedsPoints.add(new Point(x, y)); 
        
        if (random) {
            seedsPoints.stream().map((seedsPoint) -> {
                seedsPoint.x += Math.random()* canvasWidth * 0.1;
                return seedsPoint;
            }).forEach((seedsPoint) -> {
                seedsPoint.y += Math.random()* canvasHeight * 0.1;
            });
        } 
        return seedsPoints; 
    }
    
    /**
     * Will get the position to draw the seeds.. with some maths random thrown into the mix
     * @param random
     * @return seedsPoints
     */
    protected List<Point> get3SeedsPos(boolean random) {
        int x, y;
        seedsPoints.clear();    // removes all positions from the list
        x = (int)((canvasWidth - ((seedsDiameter * 2) + 15)) / 2);
        y = (int)((canvasHeight - ((seedsDiameter * 2) + 15)) / 2);
        seedsPoints.add(new Point(x, y));
        x += seedsDiameter + 15;
        seedsPoints.add(new Point(x, y)); 
        x = (int)((canvasWidth - seedsDiameter) / 2);
        y += seedsDiameter+15;
        seedsPoints.add(new Point(x, y)); 
        
        if(random) {
            seedsPoints.stream().map((seedsPoint) -> {
                seedsPoint.x += Math.random()* canvasWidth * 0.1;
                return seedsPoint;
            }).forEach((seedsPoint) -> {
                seedsPoint.y += Math.random()* canvasHeight * 0.1;
            });
        }
        return seedsPoints; 
    }
    
    /**
     * Will get the position to draw the seeds.. with some maths random thrown into the mix
     * @param random
     * @return seedsPoints
     */
    protected List<Point> get4SeedsPos(boolean random) {
        int x, y;
        seedsPoints.clear();    // removes all positions from the list
        x = (int)((canvasWidth - ((seedsDiameter * 2) + 15)) / 2);
        y = (int)((canvasHeight - ((seedsDiameter * 2) + 15)) / 2);
        seedsPoints.add(new Point(x, y));
        x += seedsDiameter + 15;
        seedsPoints.add(new Point(x, y)); 
        y += seedsDiameter + 15;
        seedsPoints.add(new Point(x, y));
        x -= seedsDiameter + 15;
        seedsPoints.add(new Point(x, y)); 
        
        if(random) {
            seedsPoints.stream().map((seedsPoint) -> {
                seedsPoint.x += Math.random()* canvasWidth * 0.1;
                return seedsPoint;
            }).forEach((seedsPoint) -> {
                seedsPoint.y += Math.random()* canvasHeight * 0.1;
            });
        }
        return seedsPoints; 
    }
    
    /**
     * Will get the position to draw the seeds.. with some maths random thrown into the mix
     * @param random
     * @return seedsPoints
     */
    protected List<Point> get5SeedsPos(boolean random) {
        int x, y;
        seedsPoints.clear();    // removes all positions from the list...
        x = (int)((canvasWidth - seedsDiameter) / 2);
        y = (int)((canvasHeight - seedsDiameter) / 2);
        seedsPoints.add(new Point(x, y));
        x = (int)((canvasWidth - ((seedsDiameter * 2.2) + 20)) / 2);
        y = (int)((canvasHeight - ((seedsDiameter * 2.2) + 20)) / 2);
        seedsPoints.add(new Point(x, y));
        x += (seedsDiameter * 1.2) + 20;
        seedsPoints.add(new Point(x, y)); 
        y += (seedsDiameter * 1.2) + 20;
        seedsPoints.add(new Point(x, y));
        x -= (seedsDiameter * 1.2) + 20;
        seedsPoints.add(new Point(x, y)); 
        
        if(random) {
            seedsPoints.stream().map((seedsPoint) -> {
                seedsPoint.x += Math.random()* canvasWidth * 0.1;
                return seedsPoint;
            }).forEach((seedsPoint) -> {
                seedsPoint.y += Math.random()* canvasHeight * 0.1;
            });
        }
        return seedsPoints; 
    }
    
    /**
     * Will get the position to draw the seeds.. with some maths random thrown into the mix
     * @return seedsPoints
     */
    protected Point getRandomSeedPos() {
        int x, y;
            // Randomise the x and y position within a set square radius...
        x = (int)(Math.random()* canvasWidth * .9);
        y = (int)(Math.random()* canvasHeight * .9);
        
        if ((x + seedsDiameter) > canvasWidth) {
            x -= seedsDiameter;
        }
        
        if ((y + seedsDiameter) > canvasHeight) {
            y -= seedsDiameter;
        }
        return new Point(x, y); 
    }

	/**
	 * Helper function to get the results
	 * @param result, random
	 * @return result
	 */ 
		
	private List<Point> getResult1Seed(List<Point> result, boolean random) {
		if (currentPoints.size() == 1) {
	        result = currentPoints;
	    } else {
	        result = get1SeedPos(random);
	        currentPoints = result;
	    }
		return result;
	}

	private List<Point> getResult2Seeds(List<Point> result, boolean random) {
		if (currentPoints.size() == 2) {
	        result = currentPoints;
	    } else {
	        result = get2SeedsPos(random);
	        currentPoints = result;
	    }
		return result;
	}

	private List<Point> getResult3Seeds(List<Point> result, boolean random) {
		if (currentPoints.size() == 3) {
	        result = currentPoints;
	    } else {
	        result = get3SeedsPos(random);
	        currentPoints = result;
	    }
		return result;
	}

	private List<Point> getResult4Seeds(List<Point> result, boolean random) {
		if (currentPoints.size() == 4) {
	        result = currentPoints;
	    } else {
	        result = get4SeedsPos(random);
	        currentPoints = result;
	    }
		return result;
	}

	private List<Point> getResult5Seeds(List<Point> result, boolean random) {
		if (currentPoints.size() == 5) {
	        result = currentPoints;
	    } else {
	        result = get5SeedsPos(random);
	        currentPoints = result;
	    }
		return result;
	}
    
    /**
     * Removes all the seeds positions from the ArrayList...
     */
    public void clearSeedPos() {
        seedsPoints.clear();
        seedsPoints = new ArrayList<>();
    }
}