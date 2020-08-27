package 백준

private val visited=BooleanArray(10)
private val arr=IntArray(10)
private val bw=System.out.bufferedWriter()
fun main() {
    val br=System.`in`.bufferedReader()
    val (n,m)=br.readLine().split(" ").map { it.toInt() }
    dfs(0,n,m)
    bw.flush()
}
private fun dfs(idx:Int,n:Int,m:Int){
    if(idx==m){
        for(i in 0 until m){
            bw.write("${arr[i]} ")
        }
        bw.write("\n")
    }
    for(i in 1..n){
        if(visited[i])
            continue
        visited[i]=true
        arr[idx]=i
        dfs(idx+1,n,m)
        visited[i]=false
    }
}