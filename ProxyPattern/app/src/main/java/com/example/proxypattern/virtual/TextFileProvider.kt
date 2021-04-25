package com.example.proxypattern.virtual

import android.os.Build
import androidx.annotation.RequiresApi
import com.example.proxypattern.virtual.ProxyTextFile
import com.example.proxypattern.virtual.SecretTextFile
import java.util.stream.Collectors
import java.util.stream.IntStream

object TextFileProvider {
    @RequiresApi(Build.VERSION_CODES.N)
    fun getSecretTextFile(start: Int, end: Int): List<SecretTextFile> {
        return IntStream
                .range(start, end).mapToObj { i -> SecretTextFile(i.toString()) }
                .collect(Collectors.toList())
    }

    @RequiresApi(Build.VERSION_CODES.N)
    fun getProxyTextFile(start: Int, end: Int): List<ProxyTextFile>{
        return IntStream
                .range(start, end).mapToObj { i -> ProxyTextFile(i.toString()) }
                .collect(Collectors.toList())
    }
}