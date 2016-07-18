package com.spring.acmeco.test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;
import org.mockito.stubbing.OngoingStubbing;

import com.spring.acmeco.Inventory;
import com.spring.acmeco.loterynumber;
import com.spring.acmelotery.finaldraw.Draw;
import com.spring.acmelotery.finaldraw.DrawLottery;



@RunWith(MockitoJUnitRunner.class)
public class lotterynumbertest {
	
	@Mock
	private Draw draw;
	
	@Mock
	private DrawLottery drawlottery;
	
	@Mock
	private loterynumber lotreynumber;
	
	
	@Before
	public void setup(){
	MockitoAnnotations.initMocks(this);
	lotreynumber = new loterynumber();
    draw = new Draw();
    drawlottery = new DrawLottery();
	}
   @Test
	public void should_return_listof_pick5(){
		
		List<String> thislist = new ArrayList<>();
	thislist =  lotreynumber.generatepick5(1);
	assertEquals(5,thislist.get(0).length());
		
	}
	
	@Test
public void should_return_listof_pick3(){
		
		List<String> thislist = new ArrayList<>();
	thislist =  lotreynumber.generatepick3(1);
	assertEquals(3,thislist.get(0).length());
		
	}


}
