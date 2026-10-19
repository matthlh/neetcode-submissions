/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        if(intervals.size() <= 1) return true;

        intervals.sort((a, b) -> {
            return Integer.compare(a.start, b.start);
        });

        int prev = intervals.get(0).end;
        for(int i = 1; i < intervals.size(); i++) {
            if(prev <= intervals.get(i).start) {
                prev = intervals.get(i).end;
            } else {
                return false;
            }
        }

        return true;
    }
}
