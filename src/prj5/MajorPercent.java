package prj5;

import java.util.Comparator;

/**
 * Class for Major Percent
 * 
 * @author group48
 * @version 04.27.2017
 */
public class MajorPercent implements Comparator<String> {
    // ~ Fields
    private int[][] like;
    private int[][] heard;


    // ~ Constructor
    /**
     * new a majorCount
     */
    public MajorPercent() {
        like = new int[4][2];
        heard = new int[4][2];
    }


    // ~ Methods
    /**
     * Increment the results
     * 
     * @param major
     *            represent the major of a student
     * @param answerHeard
     *            whether that student has heard this song or not
     * @param answerLike
     *            whether that student likes that song or not
     */
    public void increment(String major, String answerHeard, String answerLike) {
        heard(major, answerHeard);
        like(major, answerLike);

    }


    /**
     * increase the heard part
     * 
     * @param major
     *            represents the major of the student
     * @param answer
     *            answer to like or not
     */
    private void heard(String major, String answer) {
        if (compare(major, "Computer Science") == 0) {
            if (compare(answer, "Yes") == 0) {
                heard[0][1]++;
            }
            else if (compare(answer, "No") == 0) {
                heard[0][0]++;
            }
        }
        else if (compare(major, "Other Engineering") == 0) {
            if (compare(answer, "Yes") == 0) {
                heard[1][1]++;
            }
            else if (compare(answer, "No") == 0) {
                heard[1][0]++;
            }
        }
        else if (compare(major, "Math or CMDA") == 0) {
            if (compare(answer, "Yes") == 0) {
                heard[2][1]++;
            }
            else if (compare(answer, "No") == 0) {
                heard[2][0]++;
            }
        }
        else if (compare(major, "Other") == 0) {
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
     * @param major
     *            the student's major
     * @param answer
     *            answer to like or not
     */
    private void like(String major, String answer) {
        if (compare(major, "Computer Science") == 0) {
            if (compare(answer, "Yes") == 0) {
                like[0][1]++;
            }
            else if (compare(answer, "No") == 0) {
                like[0][0]++;
            }
        }
        else if (compare(major, "Other Engineering") == 0) {
            if (compare(answer, "Yes") == 0) {
                like[1][1]++;
            }
            else if (compare(answer, "No") == 0) {
                like[1][0]++;
            }
        }
        else if (compare(major, "Math or CMDA") == 0) {
            if (compare(answer, "Yes") == 0) {
                like[2][1]++;
            }
            else if (compare(answer, "No") == 0) {
                like[2][0]++;
            }
        }
        else if (compare(major, "Other") == 0) {
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
     * Compare two strings together
     * 
     * @return 0 if equal, neg if major is less than answer, and pos if greater
     */
    @Override
    public int compare(String major, String answer) {
        return major.compareTo(answer);
    }
}
