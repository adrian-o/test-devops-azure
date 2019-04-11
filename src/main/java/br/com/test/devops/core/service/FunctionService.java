package br.com.test.devops.core.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class FunctionService {
    
	public String testStr(String filial) {
		return "Deu certo, você passou a filial " + filial;
	}
}