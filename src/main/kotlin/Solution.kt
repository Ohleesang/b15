/**
 *  쿼드압축후 개수세기(2^n~2^n)
 *  S: 압축하고자하는 특정역역
 *  S 내부에 있는 모든수가 같은값이면 하나로 압축
 *  그렇지 않다면 S를 4개의 균일한 정사각형 영역으로 쪼개고,다시 압축
 *
 *  최종적으로 압축했을떄, 이때 0과 1의 갯수를 리턴하라.
 */


class Solution {
    fun solution(arr: Array<IntArray>): IntArray {
        var answer = intArrayOf(0,0)

        return answer
    }
}

fun main() {
    val a = Solution()
    a.solution(
        arrayOf(
            intArrayOf(1, 1, 0, 0),
            intArrayOf(1, 0, 0, 0),
            intArrayOf(1, 0, 0, 1),
            intArrayOf(1, 1, 1, 1)
        )
    ) //[4,9]

    a.solution(
        arrayOf(
            intArrayOf(1, 1, 1, 1, 1, 1, 1, 1),
            intArrayOf(0, 1, 1, 1, 1, 1, 1, 1),
            intArrayOf(0, 0, 0, 0, 1, 1, 1, 1),
            intArrayOf(0, 1, 0, 0, 1, 1, 1, 1),
            intArrayOf(0, 0, 0, 0, 0, 0, 1, 1),
            intArrayOf(0, 0, 0, 0, 0, 0, 0, 1),
            intArrayOf(0, 0, 0, 0, 1, 0, 0, 1),
            intArrayOf(0, 0, 0, 0, 1, 1, 1, 1),
        )
    ) //[10,15]

}