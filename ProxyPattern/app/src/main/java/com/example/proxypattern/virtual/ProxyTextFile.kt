package com.example.proxypattern.virtual

class ProxyTextFile(fileName: String): TextFile {
    // 프록시 패턴을 적용해 필요할 때만 파일 복화를 하도록 하는 클래스
    //객체를 생성할 때는 별다른 동작 x
    //하지만 실제로 데이터를 가져와야 할 때 실제 객체인 SecretTextFile 객체를 만들어내고 기능을 위임
    var fileName = fileName
    var textFile: TextFile? = null

    override fun fetch(): String {
        if (textFile == null){
            textFile = SecretTextFile(fileName)
        }
        return "[proxy]" + textFile?.fetch() //프록시 객체를 사용하는 경우에 [proxy]
    }
}