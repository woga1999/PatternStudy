package com.example.proxypattern.virtual

class SecretTextFile: TextFile {
    // 난독화 되어 있는 텍스트 파일을 복화해서 평문으로 바꿔주는 클래스
    //협업 조직에서 라이브러리로 제공한 클래스라 수정하지 못함.
    //하지만 이 클래스를 그대로 사용한다면 첫 결과가 나오기까지 6초라는 시간이 걸리는데, 목록에 20개의 파일 내용을 노출해야하는 상태라 문제가 됨!
    private var plainText: String

    constructor(fileName: String){
        //특별한 복호화 기법을 이용해 데이터를 복원해서 내용을 반환합니다.
        plainText = SecretFileHolder.decodeByFileName(fileName)
    }
    override fun fetch(): String {
        return plainText
    }
}