class Solution {
    public int solution(String s) {
        int answer = s.length();

        for (int i = 1; i <= s.length() / 2; i++) {
            StringBuilder sb = new StringBuilder();
            String tmp1 = s.substring(0, i);
            int count = 1;

            for (int j = i; j < s.length(); j += i) {
                String tmp2 = s.substring(j, Math.min(j + i, s.length()));

                if (tmp1.equals(tmp2)) {
                    count++;
                } else {
                    if (count > 1) {
                        sb.append(count);
                    }
                    sb.append(tmp1);
                    tmp1 = tmp2;
                    count = 1;
                }
            }

            if (count > 1) {
                sb.append(count);
            }
            sb.append(tmp1);

            answer = Math.min(answer, sb.length());
        }

        return answer;
    }
}
