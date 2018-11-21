package cn.foxcles.algorithm.chapter1;

/**
 * 欧几里得算法
 *
 * @author hujingqi
 * @date 2018/11/21 8:51
 * @since 1.0
 */
public class gcd {

    public static int gcd(int p, int q) {
        if (q == 0) {
            return p;
        }
        int r = p % q;
        return gcd(q, r);
    }


}
