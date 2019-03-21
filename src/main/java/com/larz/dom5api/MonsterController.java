package com.larz.dom5api;


import java.util.List;
import java.util.Optional;
import java.util.StringTokenizer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MonsterController {

	@Autowired
	private MonsterRepository monsterRepository;

	@Autowired
	private MonsterRepository2 monsterRepository2;

//	@Autowired
//	private MonsterSummaryRepository monsterSummaryRepository;
//
//	@RequestMapping("/monstersSummary")
//	ResponseEntity<?> getMonstersSummary(
//			@RequestParam(value="sort_by", required=false) String sortBy,
//			@RequestParam(value="filter_by", required=false) String filterBy,
//			@RequestParam(value="page_num", required=false) Integer pageNum,
//			@RequestParam(value="page_size", required=false) Integer pageSize) {
//		try {
//			Sort sort = null;
//			if (sortBy != null) {
//				StringTokenizer tokenizer = new StringTokenizer(sortBy, ":");
//				String field = null;
//				Direction dir = Direction.ASC;
//				if (tokenizer.hasMoreTokens()) {
//					field = tokenizer.nextToken();
//				}
//				if (tokenizer.hasMoreTokens()) {
//					dir = tokenizer.nextToken().equals("asc") ? Direction.ASC : Direction.DESC;
//				}
//				sort = new Sort(dir, field);
//			}
//			
//			Pageable page = null;
//			if (pageNum != null && pageSize != null) {
//				if (sort != null) {
//					page = PageRequest.of(pageNum, pageSize, sort);
//				} else {
//					page = PageRequest.of(pageNum, pageSize);
//				} 
//			}
//
//			String filterValue = null;
//			String filter = null;
//			if (filterBy != null) {
//				StringTokenizer tokenizer = new StringTokenizer(filterBy, ":");
//				if (tokenizer.hasMoreTokens()) {
//					filter = tokenizer.nextToken();
//				}
//				if (tokenizer.hasMoreTokens()) {
//					filterValue = tokenizer.nextToken();
//				}
//			}
//
//			List<MonsterSummary> monsters = null;
//			if (page != null) {
//				if (filter != null && filterValue != null) {
//					Page<MonsterSummary> myPage = (Page<MonsterSummary>)MonsterSummaryRepository.class.getMethod("findBy" + filter, Integer.class, Pageable.class).invoke(monsterSummaryRepository, Integer.valueOf(filterValue), page);
//					monsters = myPage.getContent();
//				} else {
//					monsters = monsterSummaryRepository.findAll(page).getContent();
//				}
//			} else if (sort != null) {
//				if (filter != null && filterValue != null) {
//					monsters = (List<MonsterSummary>)MonsterSummaryRepository.class.getMethod("findBy" + filter, Integer.class, Sort.class).invoke(monsterSummaryRepository, Integer.valueOf(filterValue), sort);
//				} else {
//					monsters = monsterSummaryRepository.findAll(sort);
//				}
//			} else {
//				if (filter != null && filterValue != null) {
//					monsters = (List<MonsterSummary>)MonsterSummaryRepository.class.getMethod("findBy" + filter, Integer.class).invoke(monsterSummaryRepository, Integer.valueOf(filterValue));
//				} else {
//					monsters = monsterSummaryRepository.findAll();
//				}
//			}
//			
//			return new ResponseEntity<List<MonsterSummary>>(monsters, HttpStatus.OK);
//		} catch (Exception e) {
//			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//		}
//	}

	@SuppressWarnings("unchecked")
	@RequestMapping("/monsters")
	ResponseEntity<?> getMonsters(
			@RequestParam(value="sort_by", required=false) String sortBy,
			@RequestParam(value="filter_by", required=false) String filterBy,
			@RequestParam(value="page_num", required=false) Integer pageNum,
			@RequestParam(value="page_size", required=false) Integer pageSize) {
		try {
			Sort sort = null;
			if (sortBy != null) {
				StringTokenizer tokenizer = new StringTokenizer(sortBy, ":");
				String field = null;
				Direction dir = Direction.ASC;
				if (tokenizer.hasMoreTokens()) {
					field = tokenizer.nextToken();
				}
				if (tokenizer.hasMoreTokens()) {
					dir = tokenizer.nextToken().equals("asc") ? Direction.ASC : Direction.DESC;
				}
				sort = new Sort(dir, field);
			}
			
			Pageable page = null;
			if (pageNum != null && pageSize != null) {
				if (sort != null) {
					page = PageRequest.of(pageNum, pageSize, sort);
				} else {
					page = PageRequest.of(pageNum, pageSize);
				}
			}
			
			String filterValue = null;
			String filter = null;
			if (filterBy != null) {
				StringTokenizer tokenizer = new StringTokenizer(filterBy, ":");
				if (tokenizer.hasMoreTokens()) {
					filter = tokenizer.nextToken();
				}
				if (tokenizer.hasMoreTokens()) {
					filterValue = tokenizer.nextToken();
				}
			}

			List<Monster> monsters = null;
			if (page != null) {
				if (filter != null && filterValue != null) {
					try {
						Page<Monster> myPage = (Page<Monster>)MonsterRepository.class.getMethod("findBy" + filter, Integer.class, Pageable.class).invoke(monsterRepository, Integer.valueOf(filterValue), page);
						monsters = myPage.getContent();
					} catch (NoSuchMethodException e) {
						Page<Monster> myPage = (Page<Monster>)MonsterRepository2.class.getMethod("findBy" + filter, Integer.class, Pageable.class).invoke(monsterRepository2, Integer.valueOf(filterValue), page);
						monsters = myPage.getContent();
					}
				} else {
					monsters = monsterRepository.findAll(page).getContent();
				}
			} else if (sort != null) {
				if (filter != null && filterValue != null) {
					try {
						monsters = (List<Monster>)MonsterRepository.class.getMethod("findBy" + filter, Integer.class, Sort.class).invoke(monsterRepository, Integer.valueOf(filterValue), sort);
					} catch (NoSuchMethodException e) {
						monsters = (List<Monster>)MonsterRepository2.class.getMethod("findBy" + filter, Integer.class, Sort.class).invoke(monsterRepository2, Integer.valueOf(filterValue), sort);
					}
				} else {
					monsters = monsterRepository.findAll(sort);
				}
			} else {
				if (filter != null && filterValue != null) {
					try {
						monsters = (List<Monster>)MonsterRepository.class.getMethod("findBy" + filter, Integer.class).invoke(monsterRepository, Integer.valueOf(filterValue));
					} catch (NoSuchMethodException e) {
						monsters = (List<Monster>)MonsterRepository2.class.getMethod("findBy" + filter, Integer.class).invoke(monsterRepository2, Integer.valueOf(filterValue));
					}
				} else {
					monsters = monsterRepository.findAll();
				}
			}
			
			return new ResponseEntity<List<Monster>>(monsters, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@RequestMapping(value= {"/monsters/{id}"}, method={RequestMethod.GET})
	@ResponseBody
	ResponseEntity<?> getMonster(@PathVariable("id") long id) {
		try {
			Optional<Monster> findById = monsterRepository.findById(id);
			return new ResponseEntity<Monster>(findById.get(), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

}
