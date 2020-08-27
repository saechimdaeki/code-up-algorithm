package 백준

private lateinit var visited:BooleanArray
private lateinit var arr:IntArray
private lateinit var answer:IntArray
private val bw= System.out.bufferedWriter()
fun main() {
    val br=System.`in`.bufferedReader()
    val (n,m)=br.readLine().split(" ").map { it.toInt() }
    arr=br.readLine().split(" ").map { it.toInt() }.toIntArray()
    visited= BooleanArray(n)
    arr.sort()
    answer= IntArray(n)
    dfs(0,n,m)
    bw.flush()
}
private fun dfs(idx:Int,n:Int,m:Int){
    if(idx==m){
        for(i in 0 until m)
            bw.write("${answer[i]} ")
        bw.write("\n")
        return
    }
    for(i in 0 until n){
        if(visited[i]) continue
        visited[i]=true
        answer[idx]= arr[i]
        dfs(idx+1,n,m)
        visited[i]=false
    }
}