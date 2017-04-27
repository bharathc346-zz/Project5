package prj5;

import java.util.Comparator;
/**
 * Class to hold the hobby percentages
 * @author group48
 * @version 4/27/2017
 *
 */
public class HobbyPercent implements Comparator<String> {
    // ~ Fields
    private int[][] like;
    private int[][] heard;


    // ~ Constructor
    /**
     * new a HobbyCount
     */
    public HobbyPercent() {
        like = new int[4][2];
        heard = new int[4][2];
    }


    // ~ Methods
    /**
     * Increment the results
     * 
     * @param hobby
     *            represent the hobby of a student
     * @param answerHeard
     *            whether that student has heard this song or not
     * @param answerLike
     *            whether that student likes that song or not
     */
    public void increment(String hobby, String answerHeard, String answerLike) {
        heard(hobby, answerHeard);
        like(hobby, answerLike);
    }


    /**
     * increase the heard part
     * 
     * @param hobby
     *            represents the hobby of the student
     * @param answer
     *            answer to like or not
     */
    private void heard(String hobby, String answer) {
        if (compare(hobby, "reading") == 0) {
            if (compare(answer, "Yes") == 0) {
                heard[0][1]++;
            }
            else if (compare(answer, "No") == 0) {
                heard[0][0]++;
            }
        }
        else if (compare(hobby, "art") == 0) {
            if (compare(answer, "Yes") == 0) {
                heard[1][1]++;
            }
            else if (compare(answer, "No") == 0) {
                heard[1][0]++;
            }
        }
        else if (compare(hobby, "sports") == 0) {
            if (compare(answer, "Yes") == 0) {
                heard[2][1]++;
            }
            else if (compare(answer, "No") == 0) {
                heard[2][0]++;
            }
        }
        else if (compare(hobby, "music") == 0) {
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
     * @param hobby
     *            the student's hobby
     * @param answer
     *            answer to like or not
     */
    private void like(String hobby, String answer) {
        if (compare(hobby, "reading") == 0) {
            if (compare(answer, "Yes") == 0) {
                like[0][1]++;
            }
            else if (compare(answer, "No") == 0) {
                like[0][0]++;
            }
        }
        else if (compare(hobby, "art") == 0) {
            if (compare(answer, "Yes") == 0) {
                like[1][1]++;
            }
            else if (compare(answer, "No") == 0) {
                like[1][0]++;
            }
        }
        else if (compare(hobby, "sports") == 0) {
            if (compare(answer, "Yes") == 0) {
                like[2][1]++;
            }
            else if (compare(answer, "No") == 0) {
                like[2][0]++;
            }
        }
        else if (compare(hobby, "music") == 0) {
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
     * Compare the two strings
     * @return 0, negative, or positive value int
     */
    @Override
    public int compare(String ans, String ques) {
        return ans.compareTo(ques);
    }

}
