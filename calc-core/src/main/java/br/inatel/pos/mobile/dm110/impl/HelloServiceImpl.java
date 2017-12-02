package br.inatel.pos.mobile.dm110.impl;

import br.inatel.pos.mobile.dm110.api.HelloService;
import br.inatel.pos.mobile.dm110.api.Result;

public class HelloServiceImpl implements HelloService{
	@Override
	public Result sum(int num1, int num2) {
		String message = Integer.toString(num1 + num2);
		Result result = new Result();
		result.setFirst(Integer.toString(num1));
		result.setSecond(Integer.toString(num2));
		result.setResult(message);
		return result;
	}

	@Override
	public Result buildSubMessage(String num1, String num2) {
		int resultSum = Integer.parseInt(num1) - Integer.parseInt(num2);
		String message = Integer.toString(resultSum);
		Result result = new Result();
		result.setFirst(num1);
		result.setSecond(num2);
		result.setResult(message);
		return result;
	}
	
}
