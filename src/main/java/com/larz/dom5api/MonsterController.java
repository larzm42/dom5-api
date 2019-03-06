package com.larz.dom5api;


import java.util.List;
import java.util.Optional;
import java.util.StringTokenizer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
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
	private MonsterSummaryRepository monsterSummaryRepository;

	@RequestMapping("/monsters")
	ResponseEntity<?> getMonsters() {
		try {
			List<MonsterSummary> monsters = monsterSummaryRepository.findAll();
			return new ResponseEntity<List<MonsterSummary>>(monsters, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@RequestMapping("/monstersFull")
	ResponseEntity<?> getMonstersFull(@RequestParam(value="sort_by", required=false) String sortBy,
			@RequestParam(value="filter_by", required=false) String filterBy,
			@RequestParam(value="start", required=false) String start,
			@RequestParam(value="limit", required=false) String limit) {
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

			List<Monster> monsters = monsterRepository.findAll(sort);
			return new ResponseEntity<List<Monster>>(monsters, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@RequestMapping(value= {"/monsters/{id}"}, method={RequestMethod.GET}, produces= {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
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
