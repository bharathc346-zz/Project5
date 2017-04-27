package prj5;

import java.util.Comparator;

/**
 * Region Percent Class
 * 
 * @author group48
 * @version 4/27/2017
 *
 */
public class RegionPercent implements Comparator<String> {
    // ~ Fields
    private int[][] heard;
    private int[][] like;


    // ~ Constructor
    /**
     * new a RegionCount
     */
    public RegionPercent() {
        heard = new int[4][2];
        like = new int[4][2];
    }


    // ~ Methods
    /**
     * Increment the results
     * 
     * @param region
     *            represent the region of a student
     * @param answerHeard
     *            whether that student has heard this song or not
     * @param answerLike
     *            whether that student likes that song or not
     */
    public void increment(
        String region,
        String answerHeard,
        String answerLike) {
        heard(region, answerHeard);
        like(region, answerLike);

    }


    /**
     * increase the heard part
     * 
     * @param region
     *            represents the region of the student
     * @param answer
     *            answer to like or not
     */
    private void heard(String region, String answer) {
        if (compare(region, "Northeast") == 0) {
            if (compare(answer, "Yes") == 0) {
                heard[0][1]++;
            }
            else if (compare(answer, "No") == 0) {
                heard[0][0]++;
            }
        }
        else if (compare(region, "Southeast") == 0) {
            if (compare(answer, "Yes") == 0) {
                heard[1][1]++;
            }
            else if (compare(answer, "No") == 0) {
                heard[1][0]++;
            }
        }
        else if (compare(region,
            "United States (other than Southeast or Northwest)") == 0) {
            if (compare(answer, "Yes") == 0) {
                heard[2][1]++;
            }
            else if (compare(answer, "No") == 0) {
                heard[2][0]++;
            }
        }
        else if (compare(region, "Outside of United States") == 0) {
            if (compare(answer, "Yes") == 0) {
                heard[3][1]++;
            }
            else if (compare(answer, "No") == 0) {
                heard[3][0]++;
            }
        }
    }


    /**
     * Increase the like part.
     * 
     * @param region
     *            the student's region
     * @param answer
     *            answer to like or not
     */
    private void like(String region, String answer) {
        if (compare(region, "Northeast") == 0) {
            if (compare(answer, "Yes") == 0) {
                like[0][1]++;
            }
            else if (compare(answer, "No") == 0) {
                like[0][0]++;
            }
        }
        else if (compare(region, "Southeast") == 0) {
            if (compare(answer, "Yes") == 0) {
                like[1][1]++;
            }
            else if (compare(answer, "No") == 0) {
                like[1][0]++;
            }
        }
        else if (compare(region,
            "United States (other than Southeast or Northwest)") == 0) {
            if (compare(answer, "Yes") == 0) {
                like[2][1]++;
            }
            else if (compare(answer, "No") == 0) {
                like[2][0]++;
            }
        }
        else if (compare(region, "Outside of United States") == 0) {
            if (compare(answer, "Yes") == 0) {
                like[3][1]++;
            }
            else if (compare(answer, "No") == 0) {
                like[3][0]++;
            }
        }
    }


    /**
     * get the heard or not results in percentages
     * 
     * @return the heard or not results
     */
    public int[] getHeard() {
        int[] result = new int[4];
        result[0] = (int)((1.0 * heard[0][1] / (heard[0][0] + heard[0][1]))
            * 100);
        result[1] = (int)((1.0 * heard[1][1] / (heard[1][0] + heard[1][1]))
            * 100);
        result[2] = (int)((1.0 * heard[2][1] / (heard[2][0] + heard[2][1]))
            * 100);
        result[3] = (int)((1.0 * heard[3][1] / (heard[3][0] + heard[3][1]))
            * 100);
        return result;
    }


    /**
     * get the like or not results
     * 
     * @return the like or not results
     */
    public int[] getLike() {
        int[] result = new int[4];
        result[0] = (int)((1.0 * like[0][1] / (like[0][0] + like[0][1])) * 100);
        result[1] = (int)((1.0 * like[1][1] / (like[1][0] + like[1][1])) * 100);
        result[2] = (int)((1.0 * like[2][1] / (like[2][0] + like[2][1])) * 100);
        result[3] = (int)((1.0 * like[3][1] / (like[3][0] + like[3][1])) * 100);
        return result;
    }


    /**
     * Compare method
     * 
     * @return Int based on the two strings
     */
    @Override
    public int compare(String region, String question) {
        return region.compareTo(question);
    }
}
