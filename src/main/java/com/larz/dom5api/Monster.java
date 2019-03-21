package com.larz.dom5api;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;


/**
 * The persistent class for the monster database table.
 * 
 */
@Entity
@JsonInclude(Include.NON_NULL)
public class Monster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Long id;
	
	@ElementCollection
    @CollectionTable(name = "monster_realm", joinColumns = @JoinColumn(name = "monster_id"))
    @Column(name = "realm")
    private List<String> realm;
	
	@ManyToMany
	@JoinTable(
			  name = "monster_armor", 
			  joinColumns = @JoinColumn(name = "monster_id"), 
			  inverseJoinColumns = @JoinColumn(name = "armor_id"))
    private List<Armor> armor;
	
	private String name;

	private Integer a;

	private Integer acidsplash;

	private Boolean adventurers;

	private Integer afflictionresistance;

	private Boolean ainorecruit;

	private Integer airattuned;

	private Boolean aisinglerec;

	private Boolean alch;

	private Integer alchemy;

	private Boolean allrange;

	private Integer ambidextrous;

	private Boolean amphibian;

	private Boolean animal;

	private Boolean animalawe;

	private Integer ap;

	private Boolean aquatic;

	private Integer assassin;

	private Integer astralattuned;

	private Boolean astralfetters;

	private Integer astralrange;

	private Integer att;

	private Boolean autocomslave;

	private Integer autodishealer;

	private Integer autohealer;

	private Integer autosum;

	private Integer awe;

	private Integer b;

	private Integer banefireshield;

	private Boolean barbs;

	private Integer basecost;

	private Integer batstartsum1;

	private Integer batstartsum1d6;

	private Integer batstartsum2;

	private Integer batstartsum2d6;

	private Integer batstartsum3;

	private Integer batstartsum3d6;

	private Boolean batstartsum4;

	private Integer batstartsum4d6;

	private Boolean batstartsum5;

	private Integer batstartsum5d6;

	private Integer batstartsum6d6;

	private Integer battlesum5;

	private Integer beartattoo;

	private Integer beastmaster;

	private Integer berserk;

	private Integer berserkwhenblessed;

	private Boolean blind;

	private Boolean bloodattuned;

	private Integer bloodvengeance;

	private Boolean bluntres;

	private Integer boartattoo;

	private Boolean body;

	private Integer bodyguard;

	private Integer bringeroffortune;

	private Boolean buffer;

	private Boolean bug;

	private Boolean captureslaves;

	private Integer castledef;

	private Boolean cavesurvival;

	private Boolean changetargetgenderforseductionandseductionimmune;

	private Integer chaospower;

	private Integer chaosrec;

	private Boolean cleanshape;

	private Integer clockworklord;

	private Integer cold;

	private Boolean coldblood;

	private Integer coldpower;

	private Boolean coldrec;

	private Integer coldres;

	private Integer coldsummon;

	private Boolean combatcaster;

	private Boolean commaster;

	private Boolean comslave;

	private Boolean corpseconstruct;

	private Integer corpseeater;

	private Boolean corrupt;

	private Integer crossbreeder;

	private Integer curseattacker;

	private Integer d;

	private Integer damagerev;

	private Integer darkpower;

	private Integer darkvision;

	private Integer deathattuned;

	private Boolean deathcurse;

	private Integer deathwail;

	private Integer def;

	private Integer defenceorganiser;

	private Boolean demon;

	private Integer digest;

	private Boolean disbel;

	private Integer disbelieveillusions;

	private Integer diseasecloud;

	private Integer disres;

	private Boolean divineins;

	private Boolean domimmortal;

	private Boolean domsummon1;

	private Boolean domsummon2;

	private Integer douse;

	private Boolean dragonmastery;

	private Boolean drainimmune;

	private Boolean drake;

	private Integer dreanimator;

	private Integer e;

	private Integer earthattuned;

	private Integer elegist;

	private Boolean elementrange;

	private Integer enc;

	private Integer enchrebate50;

	private Boolean end;

	private Boolean ethereal;

	private Boolean ethtrue;

	private Boolean event;

	private Integer explodeondeath;

	private Boolean eyeloss;

	private Integer eyes;

	private Integer f;

	private Integer fallpower;

	private Integer fear;

	private Boolean female;

	private Integer fireattuned;

	private Integer firepower;

	private Integer firerange;

	private Integer fireres;

	private Integer fireshield;

	private Integer firstshape;

	private String fixedname;

	private Integer fixedresearch;

	private Integer fixforgebonus;

	private Boolean flieswhenblessed;

	@Column(name="float")
	private Boolean floatValue;

	private Boolean flying;

	private Boolean foot;

	private Integer foreignmagicboost;

	private Integer forestshape;

	private Boolean forestsurvival;

	private Integer forgebonus;

	private Integer formationfighter;

	private Integer fortkill;

	private Boolean gem;

	private String gemprod;

	private Integer growhp;

	private Integer guardianspiritmodifier;

	private Integer h;

	private Integer halt;

	private Integer hand;

	private Integer head;

	private Boolean heal;

	private Integer heat;

	private Boolean heatrec;

	private Integer heretic;

	private Integer heroarrivallimit;

	private Boolean holy;

	private Integer homeshape;

	private Integer homesick;

	private Integer horror;

	private Boolean horrormarked;

	private Integer horrorsonly;

	private Integer horsetattoo;

	private Integer hp;

	private Integer hpoverslow;

	private Integer iceforging;

	private Integer iceprot;

	private Boolean illusion;

	private Boolean immobile;

	private Boolean immortal;

	private Boolean inanimate;

	private Boolean incorporate;

	private Boolean incprovdef;

	private Integer incunrest;

	private Integer indepmove;

	private Integer infernalcrossbreedingmult;

	private Integer infernoret;

	private Integer inn;

	private Boolean inquisitor;

	private Integer insane;

	private Integer inspirational;

	private Integer inspiringres;

	private Boolean invisibility;

	private Integer invulnerable;

	private Boolean isadaeva;

	private Boolean isashah;

	private Boolean isayazad;

	private Integer ivylord;

	private Integer kokytosret;

	private Integer lamiabonus;

	private Integer landdamage;

	private Integer landreinvigoration;

	private Integer landshape;

	private Integer leader;

	private Boolean leavespostbattleifwoundedorhaskilled;

	private Integer leper;

	private Integer link1;

	private Integer link2;

	private Boolean link3;

	private Boolean link4;

	private Boolean link5;

	private Boolean link6;

	private Boolean magicallyattunedresearcher;

	private Boolean magicbeing;

	private Integer magicboosta;

	private Integer magicboostall;

	private Integer magicboostd;

	private Integer magicbooste;

	private Integer magicboostf;

	private Integer magicboostn;

	private Integer magicboosts;

	private Integer magicboostw;

	private Integer magicleader;

	private Integer magicpower;

	private Integer makepearls;

	private Integer makesarmylooksmallerorlarger;

	private Integer mapmove;

	private Integer mask1;

	private Integer mask2;

	private Integer mask3;

	private Integer mask4;

	private Integer mask5;

	private Integer mask6;

	private Boolean mason;

	private Boolean mastersmith;

	private Integer maxage;

	private Boolean mind;

	private Integer mindslime;

	private Boolean mindvessel;

	private Integer minsizeleader;

	private Integer misc;

	private Integer mor;

	private Boolean mountainsurvival;

	private Boolean mounted;

	private Integer mr;

	private Integer mummification;

	private Integer mummify;

	private Boolean mustfightinarena;

	private Integer n;

	@Column(name="n_autosum")
	private Boolean nAutosum;

	@Column(name="n_summon")
	private Integer nSummon;

	private Integer nametype;

	private Integer natureattuned;

	private Integer naturerange;

	private Integer nbr1;

	private Integer nbr2;

	private Integer nbr3;

	private Integer nbr4;

	private Integer nbr5;

	private Integer nbr6;

	private Boolean neednoteat;

	private Integer nobadevents;

	private Boolean noheal;

	private Boolean noriverpass;

	private Boolean nowish;

	private Integer onebattlespell;

	private Integer onisummoner;

	private Boolean pathboost;

	private Integer pathcost;

	private Integer patience;

	private Integer patrolbonus;

	private Boolean petrify;

	private Boolean pierceres;

	private Integer pillagebonus;

	private Integer plainshape;

	private Boolean plant;

	private Integer poisoncloud;

	private Integer poisonres;

	private Integer poisonskin;

	private Boolean pooramphibian;

	private Integer popkill;

	private Boolean poweroftheturningyear;

	private Integer preanimator;

	private Integer prec;

	private Integer prophetshape;

	private Integer prot;

	private Integer raiseonkill;

	private Integer raiseshape;

	private Integer rand1;

	private Integer rand2;

	private Integer rand3;

	private Integer rand4;

	private Integer rand5;

	private Integer rand6;

	private Integer rcost;

	private Boolean reanimator;

	private Boolean reanimpriest;

	private Integer reclimit;

	private Boolean reform;

	private Integer regeneration;

	private Boolean reinc;

	private Integer reincarnation;

	private Integer reinvigoration;

	private Boolean requireslabtorecruit;

	private Boolean requirestempletorecruit;

	private Integer researchbonus;

	private Boolean researchwithoutmagic;

	private Integer resources;

	private Integer ressize;

	private Integer rpcost;

	private Integer rt;

	private Integer s;

	private Integer sacr;

	private Integer sailingmaxunitsize;

	private Integer sailingshipsize;

	private Integer sailsize;

	private Boolean scalewalls;

	private Integer secondshape;

	private Integer secondtmpshape;

	private Integer seduce;

	private Integer sendlesserhorrormult;

	private Integer shapechange;

	private Integer shatteredsoul;

	private Integer shockres;

	private Integer shrinkhp;

	private Integer siegebonus;

	private Integer size;

	private Boolean slashres;

	private Integer slave;

	private Integer sleepaura;

	private Integer slimer;

	private Integer slothresearch;

	private Integer snaketattoo;

	private Boolean snowmove;

	private Integer sorceryrange;

	private Boolean special;

	private Integer speciallook;

	private Boolean spellsinging;

	private Boolean spiritsight;

	private Boolean spreadchaos;

	private Boolean spreaddeath;

	private Boolean spreaddom;

	private Boolean spreadgrowth;

	private Boolean spreadorder;

	private Integer springpower;

	private Boolean spy;

	private Boolean standard;

	private Boolean startaff;

	private Integer startaffliction;

	private Integer startage;

	private Integer startagemodifier;

	private Integer startdom;

	private Integer startingaff;

	private Boolean startitem;

	private Integer stealthy;

	private Boolean stonebeing;

	private Boolean stormimmune;

	private Integer stormpower;

	private Integer str;

	private Boolean stunimmunity;

	private Boolean stupid;

	private Integer succubus;

	private Integer summerpower;

	private Integer summon;

	private Integer summon5;

	private Integer sunawe;

	private Integer supplybonus;

	private Integer supplysize;

	private Boolean swampsurvival;

	private Integer swarmbody;

	private Boolean swimming;

	private Integer taskmaster;

	private Boolean taxcollector;

	private Boolean teleport;

	private Integer templesummon;

	private Boolean theftofthesunawe;

	private Integer thronekill;

	private Boolean trample;

	private Boolean trampswallow;

	private Integer transformation;

	private Boolean triple3mon;

	private Integer triplegod;

	private Integer triplegodmag;

	private Integer turmoilsummon;

	private Boolean undead;

	private Integer undeadleader;

	private Boolean undisciplined;

	private Boolean unify;

	private Integer unique;

	private Integer unsurroundable;

	private Boolean unteleportable;

	private Boolean uwbug;

	private Integer uwdamage;

	private Integer uwheataura;

	private Integer uwregen;

	private Integer vineshield;

	private Integer voidsanity;

	private Integer voidsum;

	private Integer w;

	private Boolean wastesurvival;

	private Integer waterattuned;

	private Integer waterbreathing;

	private Integer watershape;

	private Integer winterpower;

	private Integer wolftattoo;

	private Integer xploss;

	private Integer xpshape;

	public Monster() {
	}

	public List<String> getRealm() {
		if (realm.isEmpty()) {
			return null;
		}
		return realm;
	}

	public void setRealm(List<String> realm) {
		this.realm = realm;
	}
	
	public List<Armor> getArmor() {
		return armor;
	}

	public void setArmor(List<Armor> armor) {
		this.armor = armor;
	}

	public Integer getA() {
		return this.a;
	}

	public void setA(Integer a) {
		this.a = a;
	}

	public Integer getAcidsplash() {
		return this.acidsplash;
	}

	public void setAcidsplash(Integer acidsplash) {
		this.acidsplash = acidsplash;
	}

	public Boolean getAdventurers() {
		return this.adventurers;
	}

	public void setAdventurers(Boolean adventurers) {
		this.adventurers = adventurers;
	}

	public Integer getAfflictionresistance() {
		return this.afflictionresistance;
	}

	public void setAfflictionresistance(Integer afflictionresistance) {
		this.afflictionresistance = afflictionresistance;
	}

	public Boolean getAinorecruit() {
		return this.ainorecruit;
	}

	public void setAinorecruit(Boolean ainorecruit) {
		this.ainorecruit = ainorecruit;
	}

	public Integer getAirattuned() {
		return this.airattuned;
	}

	public void setAirattuned(Integer airattuned) {
		this.airattuned = airattuned;
	}

	public Boolean getAisinglerec() {
		return this.aisinglerec;
	}

	public void setAisinglerec(Boolean aisinglerec) {
		this.aisinglerec = aisinglerec;
	}

	public Boolean getAlch() {
		return this.alch;
	}

	public void setAlch(Boolean alch) {
		this.alch = alch;
	}

	public Integer getAlchemy() {
		return this.alchemy;
	}

	public void setAlchemy(Integer alchemy) {
		this.alchemy = alchemy;
	}

	public Boolean getAllrange() {
		return this.allrange;
	}

	public void setAllrange(Boolean allrange) {
		this.allrange = allrange;
	}

	public Integer getAmbidextrous() {
		return this.ambidextrous;
	}

	public void setAmbidextrous(Integer ambidextrous) {
		this.ambidextrous = ambidextrous;
	}

	public Boolean getAmphibian() {
		return this.amphibian;
	}

	public void setAmphibian(Boolean amphibian) {
		this.amphibian = amphibian;
	}

	public Boolean getAnimal() {
		return this.animal;
	}

	public void setAnimal(Boolean animal) {
		this.animal = animal;
	}

	public Boolean getAnimalawe() {
		return this.animalawe;
	}

	public void setAnimalawe(Boolean animalawe) {
		this.animalawe = animalawe;
	}

	public Integer getAp() {
		return this.ap;
	}

	public void setAp(Integer ap) {
		this.ap = ap;
	}

	public Boolean getAquatic() {
		return this.aquatic;
	}

	public void setAquatic(Boolean aquatic) {
		this.aquatic = aquatic;
	}

	public Integer getAssassin() {
		return this.assassin;
	}

	public void setAssassin(Integer assassin) {
		this.assassin = assassin;
	}

	public Integer getAstralattuned() {
		return this.astralattuned;
	}

	public void setAstralattuned(Integer astralattuned) {
		this.astralattuned = astralattuned;
	}

	public Boolean getAstralfetters() {
		return this.astralfetters;
	}

	public void setAstralfetters(Boolean astralfetters) {
		this.astralfetters = astralfetters;
	}

	public Integer getAstralrange() {
		return this.astralrange;
	}

	public void setAstralrange(Integer astralrange) {
		this.astralrange = astralrange;
	}

	public Integer getAtt() {
		return this.att;
	}

	public void setAtt(Integer att) {
		this.att = att;
	}

	public Boolean getAutocomslave() {
		return this.autocomslave;
	}

	public void setAutocomslave(Boolean autocomslave) {
		this.autocomslave = autocomslave;
	}

	public Integer getAutodishealer() {
		return this.autodishealer;
	}

	public void setAutodishealer(Integer autodishealer) {
		this.autodishealer = autodishealer;
	}

	public Integer getAutohealer() {
		return this.autohealer;
	}

	public void setAutohealer(Integer autohealer) {
		this.autohealer = autohealer;
	}

	public Integer getAutosum() {
		return this.autosum;
	}

	public void setAutosum(Integer autosum) {
		this.autosum = autosum;
	}

	public Integer getAwe() {
		return this.awe;
	}

	public void setAwe(Integer awe) {
		this.awe = awe;
	}

	public Integer getB() {
		return this.b;
	}

	public void setB(Integer b) {
		this.b = b;
	}

	public Integer getBanefireshield() {
		return this.banefireshield;
	}

	public void setBanefireshield(Integer banefireshield) {
		this.banefireshield = banefireshield;
	}

	public Boolean getBarbs() {
		return this.barbs;
	}

	public void setBarbs(Boolean barbs) {
		this.barbs = barbs;
	}

	public Integer getBasecost() {
		return this.basecost;
	}

	public void setBasecost(Integer basecost) {
		this.basecost = basecost;
	}

	public Integer getBatstartsum1() {
		return this.batstartsum1;
	}

	public void setBatstartsum1(Integer batstartsum1) {
		this.batstartsum1 = batstartsum1;
	}

	public Integer getBatstartsum1d6() {
		return this.batstartsum1d6;
	}

	public void setBatstartsum1d6(Integer batstartsum1d6) {
		this.batstartsum1d6 = batstartsum1d6;
	}

	public Integer getBatstartsum2() {
		return this.batstartsum2;
	}

	public void setBatstartsum2(Integer batstartsum2) {
		this.batstartsum2 = batstartsum2;
	}

	public Integer getBatstartsum2d6() {
		return this.batstartsum2d6;
	}

	public void setBatstartsum2d6(Integer batstartsum2d6) {
		this.batstartsum2d6 = batstartsum2d6;
	}

	public Integer getBatstartsum3() {
		return this.batstartsum3;
	}

	public void setBatstartsum3(Integer batstartsum3) {
		this.batstartsum3 = batstartsum3;
	}

	public Integer getBatstartsum3d6() {
		return this.batstartsum3d6;
	}

	public void setBatstartsum3d6(Integer batstartsum3d6) {
		this.batstartsum3d6 = batstartsum3d6;
	}

	public Boolean getBatstartsum4() {
		return this.batstartsum4;
	}

	public void setBatstartsum4(Boolean batstartsum4) {
		this.batstartsum4 = batstartsum4;
	}

	public Integer getBatstartsum4d6() {
		return this.batstartsum4d6;
	}

	public void setBatstartsum4d6(Integer batstartsum4d6) {
		this.batstartsum4d6 = batstartsum4d6;
	}

	public Boolean getBatstartsum5() {
		return this.batstartsum5;
	}

	public void setBatstartsum5(Boolean batstartsum5) {
		this.batstartsum5 = batstartsum5;
	}

	public Integer getBatstartsum5d6() {
		return this.batstartsum5d6;
	}

	public void setBatstartsum5d6(Integer batstartsum5d6) {
		this.batstartsum5d6 = batstartsum5d6;
	}

	public Integer getBatstartsum6d6() {
		return this.batstartsum6d6;
	}

	public void setBatstartsum6d6(Integer batstartsum6d6) {
		this.batstartsum6d6 = batstartsum6d6;
	}

	public Integer getBattlesum5() {
		return this.battlesum5;
	}

	public void setBattlesum5(Integer battlesum5) {
		this.battlesum5 = battlesum5;
	}

	public Integer getBeartattoo() {
		return this.beartattoo;
	}

	public void setBeartattoo(Integer beartattoo) {
		this.beartattoo = beartattoo;
	}

	public Integer getBeastmaster() {
		return this.beastmaster;
	}

	public void setBeastmaster(Integer beastmaster) {
		this.beastmaster = beastmaster;
	}

	public Integer getBerserk() {
		return this.berserk;
	}

	public void setBerserk(Integer berserk) {
		this.berserk = berserk;
	}

	public Integer getBerserkwhenblessed() {
		return this.berserkwhenblessed;
	}

	public void setBerserkwhenblessed(Integer berserkwhenblessed) {
		this.berserkwhenblessed = berserkwhenblessed;
	}

	public Boolean getBlind() {
		return this.blind;
	}

	public void setBlind(Boolean blind) {
		this.blind = blind;
	}

	public Boolean getBloodattuned() {
		return this.bloodattuned;
	}

	public void setBloodattuned(Boolean bloodattuned) {
		this.bloodattuned = bloodattuned;
	}

	public Integer getBloodvengeance() {
		return this.bloodvengeance;
	}

	public void setBloodvengeance(Integer bloodvengeance) {
		this.bloodvengeance = bloodvengeance;
	}

	public Boolean getBluntres() {
		return this.bluntres;
	}

	public void setBluntres(Boolean bluntres) {
		this.bluntres = bluntres;
	}

	public Integer getBoartattoo() {
		return this.boartattoo;
	}

	public void setBoartattoo(Integer boartattoo) {
		this.boartattoo = boartattoo;
	}

	public Boolean getBody() {
		return this.body;
	}

	public void setBody(Boolean body) {
		this.body = body;
	}

	public Integer getBodyguard() {
		return this.bodyguard;
	}

	public void setBodyguard(Integer bodyguard) {
		this.bodyguard = bodyguard;
	}

	public Integer getBringeroffortune() {
		return this.bringeroffortune;
	}

	public void setBringeroffortune(Integer bringeroffortune) {
		this.bringeroffortune = bringeroffortune;
	}

	public Boolean getBuffer() {
		return this.buffer;
	}

	public void setBuffer(Boolean buffer) {
		this.buffer = buffer;
	}

	public Boolean getBug() {
		return this.bug;
	}

	public void setBug(Boolean bug) {
		this.bug = bug;
	}

	public Boolean getCaptureslaves() {
		return this.captureslaves;
	}

	public void setCaptureslaves(Boolean captureslaves) {
		this.captureslaves = captureslaves;
	}

	public Integer getCastledef() {
		return this.castledef;
	}

	public void setCastledef(Integer castledef) {
		this.castledef = castledef;
	}

	public Boolean getCavesurvival() {
		return this.cavesurvival;
	}

	public void setCavesurvival(Boolean cavesurvival) {
		this.cavesurvival = cavesurvival;
	}

	public Boolean getChangetargetgenderforseductionandseductionimmune() {
		return this.changetargetgenderforseductionandseductionimmune;
	}

	public void setChangetargetgenderforseductionandseductionimmune(Boolean changetargetgenderforseductionandseductionimmune) {
		this.changetargetgenderforseductionandseductionimmune = changetargetgenderforseductionandseductionimmune;
	}

	public Integer getChaospower() {
		return this.chaospower;
	}

	public void setChaospower(Integer chaospower) {
		this.chaospower = chaospower;
	}

	public Integer getChaosrec() {
		return this.chaosrec;
	}

	public void setChaosrec(Integer chaosrec) {
		this.chaosrec = chaosrec;
	}

	public Boolean getCleanshape() {
		return this.cleanshape;
	}

	public void setCleanshape(Boolean cleanshape) {
		this.cleanshape = cleanshape;
	}

	public Integer getClockworklord() {
		return this.clockworklord;
	}

	public void setClockworklord(Integer clockworklord) {
		this.clockworklord = clockworklord;
	}

	public Integer getCold() {
		return this.cold;
	}

	public void setCold(Integer cold) {
		this.cold = cold;
	}

	public Boolean getColdblood() {
		return this.coldblood;
	}

	public void setColdblood(Boolean coldblood) {
		this.coldblood = coldblood;
	}

	public Integer getColdpower() {
		return this.coldpower;
	}

	public void setColdpower(Integer coldpower) {
		this.coldpower = coldpower;
	}

	public Boolean getColdrec() {
		return this.coldrec;
	}

	public void setColdrec(Boolean coldrec) {
		this.coldrec = coldrec;
	}

	public Integer getColdres() {
		return this.coldres;
	}

	public void setColdres(Integer coldres) {
		this.coldres = coldres;
	}

	public Integer getColdsummon() {
		return this.coldsummon;
	}

	public void setColdsummon(Integer coldsummon) {
		this.coldsummon = coldsummon;
	}

	public Boolean getCombatcaster() {
		return this.combatcaster;
	}

	public void setCombatcaster(Boolean combatcaster) {
		this.combatcaster = combatcaster;
	}

	public Boolean getCommaster() {
		return this.commaster;
	}

	public void setCommaster(Boolean commaster) {
		this.commaster = commaster;
	}

	public Boolean getComslave() {
		return this.comslave;
	}

	public void setComslave(Boolean comslave) {
		this.comslave = comslave;
	}

	public Boolean getCorpseconstruct() {
		return this.corpseconstruct;
	}

	public void setCorpseconstruct(Boolean corpseconstruct) {
		this.corpseconstruct = corpseconstruct;
	}

	public Integer getCorpseeater() {
		return this.corpseeater;
	}

	public void setCorpseeater(Integer corpseeater) {
		this.corpseeater = corpseeater;
	}

	public Boolean getCorrupt() {
		return this.corrupt;
	}

	public void setCorrupt(Boolean corrupt) {
		this.corrupt = corrupt;
	}

	public Integer getCrossbreeder() {
		return this.crossbreeder;
	}

	public void setCrossbreeder(Integer crossbreeder) {
		this.crossbreeder = crossbreeder;
	}

	public Integer getCurseattacker() {
		return this.curseattacker;
	}

	public void setCurseattacker(Integer curseattacker) {
		this.curseattacker = curseattacker;
	}

	public Integer getD() {
		return this.d;
	}

	public void setD(Integer d) {
		this.d = d;
	}

	public Integer getDamagerev() {
		return this.damagerev;
	}

	public void setDamagerev(Integer damagerev) {
		this.damagerev = damagerev;
	}

	public Integer getDarkpower() {
		return this.darkpower;
	}

	public void setDarkpower(Integer darkpower) {
		this.darkpower = darkpower;
	}

	public Integer getDarkvision() {
		return this.darkvision;
	}

	public void setDarkvision(Integer darkvision) {
		this.darkvision = darkvision;
	}

	public Integer getDeathattuned() {
		return this.deathattuned;
	}

	public void setDeathattuned(Integer deathattuned) {
		this.deathattuned = deathattuned;
	}

	public Boolean getDeathcurse() {
		return this.deathcurse;
	}

	public void setDeathcurse(Boolean deathcurse) {
		this.deathcurse = deathcurse;
	}

	public Integer getDeathwail() {
		return this.deathwail;
	}

	public void setDeathwail(Integer deathwail) {
		this.deathwail = deathwail;
	}

	public Integer getDef() {
		return this.def;
	}

	public void setDef(Integer def) {
		this.def = def;
	}

	public Integer getDefenceorganiser() {
		return this.defenceorganiser;
	}

	public void setDefenceorganiser(Integer defenceorganiser) {
		this.defenceorganiser = defenceorganiser;
	}

	public Boolean getDemon() {
		return this.demon;
	}

	public void setDemon(Boolean demon) {
		this.demon = demon;
	}

	public Integer getDigest() {
		return this.digest;
	}

	public void setDigest(Integer digest) {
		this.digest = digest;
	}

	public Boolean getDisbel() {
		return this.disbel;
	}

	public void setDisbel(Boolean disbel) {
		this.disbel = disbel;
	}

	public Integer getDisbelieveillusions() {
		return this.disbelieveillusions;
	}

	public void setDisbelieveillusions(Integer disbelieveillusions) {
		this.disbelieveillusions = disbelieveillusions;
	}

	public Integer getDiseasecloud() {
		return this.diseasecloud;
	}

	public void setDiseasecloud(Integer diseasecloud) {
		this.diseasecloud = diseasecloud;
	}

	public Integer getDisres() {
		return this.disres;
	}

	public void setDisres(Integer disres) {
		this.disres = disres;
	}

	public Boolean getDivineins() {
		return this.divineins;
	}

	public void setDivineins(Boolean divineins) {
		this.divineins = divineins;
	}

	public Boolean getDomimmortal() {
		return this.domimmortal;
	}

	public void setDomimmortal(Boolean domimmortal) {
		this.domimmortal = domimmortal;
	}

	public Boolean getDomsummon1() {
		return this.domsummon1;
	}

	public void setDomsummon1(Boolean domsummon1) {
		this.domsummon1 = domsummon1;
	}

	public Boolean getDomsummon2() {
		return this.domsummon2;
	}

	public void setDomsummon2(Boolean domsummon2) {
		this.domsummon2 = domsummon2;
	}

	public Integer getDouse() {
		return this.douse;
	}

	public void setDouse(Integer douse) {
		this.douse = douse;
	}

	public Boolean getDragonmastery() {
		return this.dragonmastery;
	}

	public void setDragonmastery(Boolean dragonmastery) {
		this.dragonmastery = dragonmastery;
	}

	public Boolean getDrainimmune() {
		return this.drainimmune;
	}

	public void setDrainimmune(Boolean drainimmune) {
		this.drainimmune = drainimmune;
	}

	public Boolean getDrake() {
		return this.drake;
	}

	public void setDrake(Boolean drake) {
		this.drake = drake;
	}

	public Integer getDreanimator() {
		return this.dreanimator;
	}

	public void setDreanimator(Integer dreanimator) {
		this.dreanimator = dreanimator;
	}

	public Integer getE() {
		return this.e;
	}

	public void setE(Integer e) {
		this.e = e;
	}

	public Integer getEarthattuned() {
		return this.earthattuned;
	}

	public void setEarthattuned(Integer earthattuned) {
		this.earthattuned = earthattuned;
	}

	public Integer getElegist() {
		return this.elegist;
	}

	public void setElegist(Integer elegist) {
		this.elegist = elegist;
	}

	public Boolean getElementrange() {
		return this.elementrange;
	}

	public void setElementrange(Boolean elementrange) {
		this.elementrange = elementrange;
	}

	public Integer getEnc() {
		return this.enc;
	}

	public void setEnc(Integer enc) {
		this.enc = enc;
	}

	public Integer getEnchrebate50() {
		return this.enchrebate50;
	}

	public void setEnchrebate50(Integer enchrebate50) {
		this.enchrebate50 = enchrebate50;
	}

	public Boolean getEnd() {
		return this.end;
	}

	public void setEnd(Boolean end) {
		this.end = end;
	}

	public Boolean getEthereal() {
		return this.ethereal;
	}

	public void setEthereal(Boolean ethereal) {
		this.ethereal = ethereal;
	}

	public Boolean getEthtrue() {
		return this.ethtrue;
	}

	public void setEthtrue(Boolean ethtrue) {
		this.ethtrue = ethtrue;
	}

	public Boolean getEvent() {
		return this.event;
	}

	public void setEvent(Boolean event) {
		this.event = event;
	}

	public Integer getExplodeondeath() {
		return this.explodeondeath;
	}

	public void setExplodeondeath(Integer explodeondeath) {
		this.explodeondeath = explodeondeath;
	}

	public Boolean getEyeloss() {
		return this.eyeloss;
	}

	public void setEyeloss(Boolean eyeloss) {
		this.eyeloss = eyeloss;
	}

	public Integer getEyes() {
		return this.eyes;
	}

	public void setEyes(Integer eyes) {
		this.eyes = eyes;
	}

	public Integer getF() {
		return this.f;
	}

	public void setF(Integer f) {
		this.f = f;
	}

	public Integer getFallpower() {
		return this.fallpower;
	}

	public void setFallpower(Integer fallpower) {
		this.fallpower = fallpower;
	}

	public Integer getFear() {
		return this.fear;
	}

	public void setFear(Integer fear) {
		this.fear = fear;
	}

	public Boolean getFemale() {
		return this.female;
	}

	public void setFemale(Boolean female) {
		this.female = female;
	}

	public Integer getFireattuned() {
		return this.fireattuned;
	}

	public void setFireattuned(Integer fireattuned) {
		this.fireattuned = fireattuned;
	}

	public Integer getFirepower() {
		return this.firepower;
	}

	public void setFirepower(Integer firepower) {
		this.firepower = firepower;
	}

	public Integer getFirerange() {
		return this.firerange;
	}

	public void setFirerange(Integer firerange) {
		this.firerange = firerange;
	}

	public Integer getFireres() {
		return this.fireres;
	}

	public void setFireres(Integer fireres) {
		this.fireres = fireres;
	}

	public Integer getFireshield() {
		return this.fireshield;
	}

	public void setFireshield(Integer fireshield) {
		this.fireshield = fireshield;
	}

	public Integer getFirstshape() {
		return this.firstshape;
	}

	public void setFirstshape(Integer firstshape) {
		this.firstshape = firstshape;
	}

	public String getFixedname() {
		return this.fixedname;
	}

	public void setFixedname(String fixedname) {
		this.fixedname = fixedname;
	}

	public Integer getFixedresearch() {
		return this.fixedresearch;
	}

	public void setFixedresearch(Integer fixedresearch) {
		this.fixedresearch = fixedresearch;
	}

	public Integer getFixforgebonus() {
		return this.fixforgebonus;
	}

	public void setFixforgebonus(Integer fixforgebonus) {
		this.fixforgebonus = fixforgebonus;
	}

	public Boolean getFlieswhenblessed() {
		return this.flieswhenblessed;
	}

	public void setFlieswhenblessed(Boolean flieswhenblessed) {
		this.flieswhenblessed = flieswhenblessed;
	}

	public Boolean getFloatValue() {
		return this.floatValue;
	}

	public void setFloatValue(Boolean float_) {
		this.floatValue = float_;
	}

	public Boolean getFlying() {
		return this.flying;
	}

	public void setFlying(Boolean flying) {
		this.flying = flying;
	}

	public Boolean getFoot() {
		return this.foot;
	}

	public void setFoot(Boolean foot) {
		this.foot = foot;
	}

	public Integer getForeignmagicboost() {
		return this.foreignmagicboost;
	}

	public void setForeignmagicboost(Integer foreignmagicboost) {
		this.foreignmagicboost = foreignmagicboost;
	}

	public Integer getForestshape() {
		return this.forestshape;
	}

	public void setForestshape(Integer forestshape) {
		this.forestshape = forestshape;
	}

	public Boolean getForestsurvival() {
		return this.forestsurvival;
	}

	public void setForestsurvival(Boolean forestsurvival) {
		this.forestsurvival = forestsurvival;
	}

	public Integer getForgebonus() {
		return this.forgebonus;
	}

	public void setForgebonus(Integer forgebonus) {
		this.forgebonus = forgebonus;
	}

	public Integer getFormationfighter() {
		return this.formationfighter;
	}

	public void setFormationfighter(Integer formationfighter) {
		this.formationfighter = formationfighter;
	}

	public Integer getFortkill() {
		return this.fortkill;
	}

	public void setFortkill(Integer fortkill) {
		this.fortkill = fortkill;
	}

	public Boolean getGem() {
		return this.gem;
	}

	public void setGem(Boolean gem) {
		this.gem = gem;
	}

	public String getGemprod() {
		return this.gemprod;
	}

	public void setGemprod(String gemprod) {
		this.gemprod = gemprod;
	}

	public Integer getGrowhp() {
		return this.growhp;
	}

	public void setGrowhp(Integer growhp) {
		this.growhp = growhp;
	}

	public Integer getGuardianspiritmodifier() {
		return this.guardianspiritmodifier;
	}

	public void setGuardianspiritmodifier(Integer guardianspiritmodifier) {
		this.guardianspiritmodifier = guardianspiritmodifier;
	}

	public Integer getH() {
		return this.h;
	}

	public void setH(Integer h) {
		this.h = h;
	}

	public Integer getHalt() {
		return this.halt;
	}

	public void setHalt(Integer halt) {
		this.halt = halt;
	}

	public Integer getHand() {
		return this.hand;
	}

	public void setHand(Integer hand) {
		this.hand = hand;
	}

	public Integer getHead() {
		return this.head;
	}

	public void setHead(Integer head) {
		this.head = head;
	}

	public Boolean getHeal() {
		return this.heal;
	}

	public void setHeal(Boolean heal) {
		this.heal = heal;
	}

	public Integer getHeat() {
		return this.heat;
	}

	public void setHeat(Integer heat) {
		this.heat = heat;
	}

	public Boolean getHeatrec() {
		return this.heatrec;
	}

	public void setHeatrec(Boolean heatrec) {
		this.heatrec = heatrec;
	}

	public Integer getHeretic() {
		return this.heretic;
	}

	public void setHeretic(Integer heretic) {
		this.heretic = heretic;
	}

	public Integer getHeroarrivallimit() {
		return this.heroarrivallimit;
	}

	public void setHeroarrivallimit(Integer heroarrivallimit) {
		this.heroarrivallimit = heroarrivallimit;
	}

	public Boolean getHoly() {
		return this.holy;
	}

	public void setHoly(Boolean holy) {
		this.holy = holy;
	}

	public Integer getHomeshape() {
		return this.homeshape;
	}

	public void setHomeshape(Integer homeshape) {
		this.homeshape = homeshape;
	}

	public Integer getHomesick() {
		return this.homesick;
	}

	public void setHomesick(Integer homesick) {
		this.homesick = homesick;
	}

	public Integer getHorror() {
		return this.horror;
	}

	public void setHorror(Integer horror) {
		this.horror = horror;
	}

	public Boolean getHorrormarked() {
		return this.horrormarked;
	}

	public void setHorrormarked(Boolean horrormarked) {
		this.horrormarked = horrormarked;
	}

	public Integer getHorrorsonly() {
		return this.horrorsonly;
	}

	public void setHorrorsonly(Integer horrorsonly) {
		this.horrorsonly = horrorsonly;
	}

	public Integer getHorsetattoo() {
		return this.horsetattoo;
	}

	public void setHorsetattoo(Integer horsetattoo) {
		this.horsetattoo = horsetattoo;
	}

	public Integer getHp() {
		return this.hp;
	}

	public void setHp(Integer hp) {
		this.hp = hp;
	}

	public Integer getHpoverslow() {
		return this.hpoverslow;
	}

	public void setHpoverslow(Integer hpoverslow) {
		this.hpoverslow = hpoverslow;
	}

	public Integer getIceforging() {
		return this.iceforging;
	}

	public void setIceforging(Integer iceforging) {
		this.iceforging = iceforging;
	}

	public Integer getIceprot() {
		return this.iceprot;
	}

	public void setIceprot(Integer iceprot) {
		this.iceprot = iceprot;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Boolean getIllusion() {
		return this.illusion;
	}

	public void setIllusion(Boolean illusion) {
		this.illusion = illusion;
	}

	public Boolean getImmobile() {
		return this.immobile;
	}

	public void setImmobile(Boolean immobile) {
		this.immobile = immobile;
	}

	public Boolean getImmortal() {
		return this.immortal;
	}

	public void setImmortal(Boolean immortal) {
		this.immortal = immortal;
	}

	public Boolean getInanimate() {
		return this.inanimate;
	}

	public void setInanimate(Boolean inanimate) {
		this.inanimate = inanimate;
	}

	public Boolean getIncorporate() {
		return this.incorporate;
	}

	public void setIncorporate(Boolean incorporate) {
		this.incorporate = incorporate;
	}

	public Boolean getIncprovdef() {
		return this.incprovdef;
	}

	public void setIncprovdef(Boolean incprovdef) {
		this.incprovdef = incprovdef;
	}

	public Integer getIncunrest() {
		return this.incunrest;
	}

	public void setIncunrest(Integer incunrest) {
		this.incunrest = incunrest;
	}

	public Integer getIndepmove() {
		return this.indepmove;
	}

	public void setIndepmove(Integer indepmove) {
		this.indepmove = indepmove;
	}

	public Integer getInfernalcrossbreedingmult() {
		return this.infernalcrossbreedingmult;
	}

	public void setInfernalcrossbreedingmult(Integer infernalcrossbreedingmult) {
		this.infernalcrossbreedingmult = infernalcrossbreedingmult;
	}

	public Integer getInfernoret() {
		return this.infernoret;
	}

	public void setInfernoret(Integer infernoret) {
		this.infernoret = infernoret;
	}

	public Integer getInn() {
		return this.inn;
	}

	public void setInn(Integer inn) {
		this.inn = inn;
	}

	public Boolean getInquisitor() {
		return this.inquisitor;
	}

	public void setInquisitor(Boolean inquisitor) {
		this.inquisitor = inquisitor;
	}

	public Integer getInsane() {
		return this.insane;
	}

	public void setInsane(Integer insane) {
		this.insane = insane;
	}

	public Integer getInspirational() {
		return this.inspirational;
	}

	public void setInspirational(Integer inspirational) {
		this.inspirational = inspirational;
	}

	public Integer getInspiringres() {
		return this.inspiringres;
	}

	public void setInspiringres(Integer inspiringres) {
		this.inspiringres = inspiringres;
	}

	public Boolean getInvisibility() {
		return this.invisibility;
	}

	public void setInvisibility(Boolean invisibility) {
		this.invisibility = invisibility;
	}

	public Integer getInvulnerable() {
		return this.invulnerable;
	}

	public void setInvulnerable(Integer invulnerable) {
		this.invulnerable = invulnerable;
	}

	public Boolean getIsadaeva() {
		return this.isadaeva;
	}

	public void setIsadaeva(Boolean isadaeva) {
		this.isadaeva = isadaeva;
	}

	public Boolean getIsashah() {
		return this.isashah;
	}

	public void setIsashah(Boolean isashah) {
		this.isashah = isashah;
	}

	public Boolean getIsayazad() {
		return this.isayazad;
	}

	public void setIsayazad(Boolean isayazad) {
		this.isayazad = isayazad;
	}

	public Integer getIvylord() {
		return this.ivylord;
	}

	public void setIvylord(Integer ivylord) {
		this.ivylord = ivylord;
	}

	public Integer getKokytosret() {
		return this.kokytosret;
	}

	public void setKokytosret(Integer kokytosret) {
		this.kokytosret = kokytosret;
	}

	public Integer getLamiabonus() {
		return this.lamiabonus;
	}

	public void setLamiabonus(Integer lamiabonus) {
		this.lamiabonus = lamiabonus;
	}

	public Integer getLanddamage() {
		return this.landdamage;
	}

	public void setLanddamage(Integer landdamage) {
		this.landdamage = landdamage;
	}

	public Integer getLandreinvigoration() {
		return this.landreinvigoration;
	}

	public void setLandreinvigoration(Integer landreinvigoration) {
		this.landreinvigoration = landreinvigoration;
	}

	public Integer getLandshape() {
		return this.landshape;
	}

	public void setLandshape(Integer landshape) {
		this.landshape = landshape;
	}

	public Integer getLeader() {
		return this.leader;
	}

	public void setLeader(Integer leader) {
		this.leader = leader;
	}

	public Boolean getLeavespostbattleifwoundedorhaskilled() {
		return this.leavespostbattleifwoundedorhaskilled;
	}

	public void setLeavespostbattleifwoundedorhaskilled(Boolean leavespostbattleifwoundedorhaskilled) {
		this.leavespostbattleifwoundedorhaskilled = leavespostbattleifwoundedorhaskilled;
	}

	public Integer getLeper() {
		return this.leper;
	}

	public void setLeper(Integer leper) {
		this.leper = leper;
	}

	public Integer getLink1() {
		return this.link1;
	}

	public void setLink1(Integer link1) {
		this.link1 = link1;
	}

	public Integer getLink2() {
		return this.link2;
	}

	public void setLink2(Integer link2) {
		this.link2 = link2;
	}

	public Boolean getLink3() {
		return this.link3;
	}

	public void setLink3(Boolean link3) {
		this.link3 = link3;
	}

	public Boolean getLink4() {
		return this.link4;
	}

	public void setLink4(Boolean link4) {
		this.link4 = link4;
	}

	public Boolean getLink5() {
		return this.link5;
	}

	public void setLink5(Boolean link5) {
		this.link5 = link5;
	}

	public Boolean getLink6() {
		return this.link6;
	}

	public void setLink6(Boolean link6) {
		this.link6 = link6;
	}

	public Boolean getMagicallyattunedresearcher() {
		return this.magicallyattunedresearcher;
	}

	public void setMagicallyattunedresearcher(Boolean magicallyattunedresearcher) {
		this.magicallyattunedresearcher = magicallyattunedresearcher;
	}

	public Boolean getMagicbeing() {
		return this.magicbeing;
	}

	public void setMagicbeing(Boolean magicbeing) {
		this.magicbeing = magicbeing;
	}

	public Integer getMagicboosta() {
		return this.magicboosta;
	}

	public void setMagicboosta(Integer magicboosta) {
		this.magicboosta = magicboosta;
	}

	public Integer getMagicboostall() {
		return this.magicboostall;
	}

	public void setMagicboostall(Integer magicboostall) {
		this.magicboostall = magicboostall;
	}

	public Integer getMagicboostd() {
		return this.magicboostd;
	}

	public void setMagicboostd(Integer magicboostd) {
		this.magicboostd = magicboostd;
	}

	public Integer getMagicbooste() {
		return this.magicbooste;
	}

	public void setMagicbooste(Integer magicbooste) {
		this.magicbooste = magicbooste;
	}

	public Integer getMagicboostf() {
		return this.magicboostf;
	}

	public void setMagicboostf(Integer magicboostf) {
		this.magicboostf = magicboostf;
	}

	public Integer getMagicboostn() {
		return this.magicboostn;
	}

	public void setMagicboostn(Integer magicboostn) {
		this.magicboostn = magicboostn;
	}

	public Integer getMagicboosts() {
		return this.magicboosts;
	}

	public void setMagicboosts(Integer magicboosts) {
		this.magicboosts = magicboosts;
	}

	public Integer getMagicboostw() {
		return this.magicboostw;
	}

	public void setMagicboostw(Integer magicboostw) {
		this.magicboostw = magicboostw;
	}

	public Integer getMagicleader() {
		return this.magicleader;
	}

	public void setMagicleader(Integer magicleader) {
		this.magicleader = magicleader;
	}

	public Integer getMagicpower() {
		return this.magicpower;
	}

	public void setMagicpower(Integer magicpower) {
		this.magicpower = magicpower;
	}

	public Integer getMakepearls() {
		return this.makepearls;
	}

	public void setMakepearls(Integer makepearls) {
		this.makepearls = makepearls;
	}

	public Integer getMakesarmylooksmallerorlarger() {
		return this.makesarmylooksmallerorlarger;
	}

	public void setMakesarmylooksmallerorlarger(Integer makesarmylooksmallerorlarger) {
		this.makesarmylooksmallerorlarger = makesarmylooksmallerorlarger;
	}

	public Integer getMapmove() {
		return this.mapmove;
	}

	public void setMapmove(Integer mapmove) {
		this.mapmove = mapmove;
	}

	public Integer getMask1() {
		return this.mask1;
	}

	public void setMask1(Integer mask1) {
		this.mask1 = mask1;
	}

	public Integer getMask2() {
		return this.mask2;
	}

	public void setMask2(Integer mask2) {
		this.mask2 = mask2;
	}

	public Integer getMask3() {
		return this.mask3;
	}

	public void setMask3(Integer mask3) {
		this.mask3 = mask3;
	}

	public Integer getMask4() {
		return this.mask4;
	}

	public void setMask4(Integer mask4) {
		this.mask4 = mask4;
	}

	public Integer getMask5() {
		return this.mask5;
	}

	public void setMask5(Integer mask5) {
		this.mask5 = mask5;
	}

	public Integer getMask6() {
		return this.mask6;
	}

	public void setMask6(Integer mask6) {
		this.mask6 = mask6;
	}

	public Boolean getMason() {
		return this.mason;
	}

	public void setMason(Boolean mason) {
		this.mason = mason;
	}

	public Boolean getMastersmith() {
		return this.mastersmith;
	}

	public void setMastersmith(Boolean mastersmith) {
		this.mastersmith = mastersmith;
	}

	public Integer getMaxage() {
		return this.maxage;
	}

	public void setMaxage(Integer maxage) {
		this.maxage = maxage;
	}

	public Boolean getMind() {
		return this.mind;
	}

	public void setMind(Boolean mind) {
		this.mind = mind;
	}

	public Integer getMindslime() {
		return this.mindslime;
	}

	public void setMindslime(Integer mindslime) {
		this.mindslime = mindslime;
	}

	public Boolean getMindvessel() {
		return this.mindvessel;
	}

	public void setMindvessel(Boolean mindvessel) {
		this.mindvessel = mindvessel;
	}

	public Integer getMinsizeleader() {
		return this.minsizeleader;
	}

	public void setMinsizeleader(Integer minsizeleader) {
		this.minsizeleader = minsizeleader;
	}

	public Integer getMisc() {
		return this.misc;
	}

	public void setMisc(Integer misc) {
		this.misc = misc;
	}

	public Integer getMor() {
		return this.mor;
	}

	public void setMor(Integer mor) {
		this.mor = mor;
	}

	public Boolean getMountainsurvival() {
		return this.mountainsurvival;
	}

	public void setMountainsurvival(Boolean mountainsurvival) {
		this.mountainsurvival = mountainsurvival;
	}

	public Boolean getMounted() {
		return this.mounted;
	}

	public void setMounted(Boolean mounted) {
		this.mounted = mounted;
	}

	public Integer getMr() {
		return this.mr;
	}

	public void setMr(Integer mr) {
		this.mr = mr;
	}

	public Integer getMummification() {
		return this.mummification;
	}

	public void setMummification(Integer mummification) {
		this.mummification = mummification;
	}

	public Integer getMummify() {
		return this.mummify;
	}

	public void setMummify(Integer mummify) {
		this.mummify = mummify;
	}

	public Boolean getMustfightinarena() {
		return this.mustfightinarena;
	}

	public void setMustfightinarena(Boolean mustfightinarena) {
		this.mustfightinarena = mustfightinarena;
	}

	public Integer getN() {
		return this.n;
	}

	public void setN(Integer n) {
		this.n = n;
	}

	public Boolean getNAutosum() {
		return this.nAutosum;
	}

	public void setNAutosum(Boolean nAutosum) {
		this.nAutosum = nAutosum;
	}

	public Integer getNSummon() {
		return this.nSummon;
	}

	public void setNSummon(Integer nSummon) {
		this.nSummon = nSummon;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getNametype() {
		return this.nametype;
	}

	public void setNametype(Integer nametype) {
		this.nametype = nametype;
	}

	public Integer getNatureattuned() {
		return this.natureattuned;
	}

	public void setNatureattuned(Integer natureattuned) {
		this.natureattuned = natureattuned;
	}

	public Integer getNaturerange() {
		return this.naturerange;
	}

	public void setNaturerange(Integer naturerange) {
		this.naturerange = naturerange;
	}

	public Integer getNbr1() {
		return this.nbr1;
	}

	public void setNbr1(Integer nbr1) {
		this.nbr1 = nbr1;
	}

	public Integer getNbr2() {
		return this.nbr2;
	}

	public void setNbr2(Integer nbr2) {
		this.nbr2 = nbr2;
	}

	public Integer getNbr3() {
		return this.nbr3;
	}

	public void setNbr3(Integer nbr3) {
		this.nbr3 = nbr3;
	}

	public Integer getNbr4() {
		return this.nbr4;
	}

	public void setNbr4(Integer nbr4) {
		this.nbr4 = nbr4;
	}

	public Integer getNbr5() {
		return this.nbr5;
	}

	public void setNbr5(Integer nbr5) {
		this.nbr5 = nbr5;
	}

	public Integer getNbr6() {
		return this.nbr6;
	}

	public void setNbr6(Integer nbr6) {
		this.nbr6 = nbr6;
	}

	public Boolean getNeednoteat() {
		return this.neednoteat;
	}

	public void setNeednoteat(Boolean neednoteat) {
		this.neednoteat = neednoteat;
	}

	public Integer getNobadevents() {
		return this.nobadevents;
	}

	public void setNobadevents(Integer nobadevents) {
		this.nobadevents = nobadevents;
	}

	public Boolean getNoheal() {
		return this.noheal;
	}

	public void setNoheal(Boolean noheal) {
		this.noheal = noheal;
	}

	public Boolean getNoriverpass() {
		return this.noriverpass;
	}

	public void setNoriverpass(Boolean noriverpass) {
		this.noriverpass = noriverpass;
	}

	public Boolean getNowish() {
		return this.nowish;
	}

	public void setNowish(Boolean nowish) {
		this.nowish = nowish;
	}

	public Integer getOnebattlespell() {
		return this.onebattlespell;
	}

	public void setOnebattlespell(Integer onebattlespell) {
		this.onebattlespell = onebattlespell;
	}

	public Integer getOnisummoner() {
		return this.onisummoner;
	}

	public void setOnisummoner(Integer onisummoner) {
		this.onisummoner = onisummoner;
	}

	public Boolean getPathboost() {
		return this.pathboost;
	}

	public void setPathboost(Boolean pathboost) {
		this.pathboost = pathboost;
	}

	public Integer getPathcost() {
		return this.pathcost;
	}

	public void setPathcost(Integer pathcost) {
		this.pathcost = pathcost;
	}

	public Integer getPatience() {
		return this.patience;
	}

	public void setPatience(Integer patience) {
		this.patience = patience;
	}

	public Integer getPatrolbonus() {
		return this.patrolbonus;
	}

	public void setPatrolbonus(Integer patrolbonus) {
		this.patrolbonus = patrolbonus;
	}

	public Boolean getPetrify() {
		return this.petrify;
	}

	public void setPetrify(Boolean petrify) {
		this.petrify = petrify;
	}

	public Boolean getPierceres() {
		return this.pierceres;
	}

	public void setPierceres(Boolean pierceres) {
		this.pierceres = pierceres;
	}

	public Integer getPillagebonus() {
		return this.pillagebonus;
	}

	public void setPillagebonus(Integer pillagebonus) {
		this.pillagebonus = pillagebonus;
	}

	public Integer getPlainshape() {
		return this.plainshape;
	}

	public void setPlainshape(Integer plainshape) {
		this.plainshape = plainshape;
	}

	public Boolean getPlant() {
		return this.plant;
	}

	public void setPlant(Boolean plant) {
		this.plant = plant;
	}

	public Integer getPoisoncloud() {
		return this.poisoncloud;
	}

	public void setPoisoncloud(Integer poisoncloud) {
		this.poisoncloud = poisoncloud;
	}

	public Integer getPoisonres() {
		return this.poisonres;
	}

	public void setPoisonres(Integer poisonres) {
		this.poisonres = poisonres;
	}

	public Integer getPoisonskin() {
		return this.poisonskin;
	}

	public void setPoisonskin(Integer poisonskin) {
		this.poisonskin = poisonskin;
	}

	public Boolean getPooramphibian() {
		return this.pooramphibian;
	}

	public void setPooramphibian(Boolean pooramphibian) {
		this.pooramphibian = pooramphibian;
	}

	public Integer getPopkill() {
		return this.popkill;
	}

	public void setPopkill(Integer popkill) {
		this.popkill = popkill;
	}

	public Boolean getPoweroftheturningyear() {
		return this.poweroftheturningyear;
	}

	public void setPoweroftheturningyear(Boolean poweroftheturningyear) {
		this.poweroftheturningyear = poweroftheturningyear;
	}

	public Integer getPreanimator() {
		return this.preanimator;
	}

	public void setPreanimator(Integer preanimator) {
		this.preanimator = preanimator;
	}

	public Integer getPrec() {
		return this.prec;
	}

	public void setPrec(Integer prec) {
		this.prec = prec;
	}

	public Integer getProphetshape() {
		return this.prophetshape;
	}

	public void setProphetshape(Integer prophetshape) {
		this.prophetshape = prophetshape;
	}

	public Integer getProt() {
		return this.prot;
	}

	public void setProt(Integer prot) {
		this.prot = prot;
	}

	public Integer getRaiseonkill() {
		return this.raiseonkill;
	}

	public void setRaiseonkill(Integer raiseonkill) {
		this.raiseonkill = raiseonkill;
	}

	public Integer getRaiseshape() {
		return this.raiseshape;
	}

	public void setRaiseshape(Integer raiseshape) {
		this.raiseshape = raiseshape;
	}

	public Integer getRand1() {
		return this.rand1;
	}

	public void setRand1(Integer rand1) {
		this.rand1 = rand1;
	}

	public Integer getRand2() {
		return this.rand2;
	}

	public void setRand2(Integer rand2) {
		this.rand2 = rand2;
	}

	public Integer getRand3() {
		return this.rand3;
	}

	public void setRand3(Integer rand3) {
		this.rand3 = rand3;
	}

	public Integer getRand4() {
		return this.rand4;
	}

	public void setRand4(Integer rand4) {
		this.rand4 = rand4;
	}

	public Integer getRand5() {
		return this.rand5;
	}

	public void setRand5(Integer rand5) {
		this.rand5 = rand5;
	}

	public Integer getRand6() {
		return this.rand6;
	}

	public void setRand6(Integer rand6) {
		this.rand6 = rand6;
	}

	public Integer getRcost() {
		return this.rcost;
	}

	public void setRcost(Integer rcost) {
		this.rcost = rcost;
	}

	public Boolean getReanimator() {
		return this.reanimator;
	}

	public void setReanimator(Boolean reanimator) {
		this.reanimator = reanimator;
	}

	public Boolean getReanimpriest() {
		return this.reanimpriest;
	}

	public void setReanimpriest(Boolean reanimpriest) {
		this.reanimpriest = reanimpriest;
	}

	public Integer getReclimit() {
		return this.reclimit;
	}

	public void setReclimit(Integer reclimit) {
		this.reclimit = reclimit;
	}

	public Boolean getReform() {
		return this.reform;
	}

	public void setReform(Boolean reform) {
		this.reform = reform;
	}

	public Integer getRegeneration() {
		return this.regeneration;
	}

	public void setRegeneration(Integer regeneration) {
		this.regeneration = regeneration;
	}

	public Boolean getReinc() {
		return this.reinc;
	}

	public void setReinc(Boolean reinc) {
		this.reinc = reinc;
	}

	public Integer getReincarnation() {
		return this.reincarnation;
	}

	public void setReincarnation(Integer reincarnation) {
		this.reincarnation = reincarnation;
	}

	public Integer getReinvigoration() {
		return this.reinvigoration;
	}

	public void setReinvigoration(Integer reinvigoration) {
		this.reinvigoration = reinvigoration;
	}

	public Boolean getRequireslabtorecruit() {
		return this.requireslabtorecruit;
	}

	public void setRequireslabtorecruit(Boolean requireslabtorecruit) {
		this.requireslabtorecruit = requireslabtorecruit;
	}

	public Boolean getRequirestempletorecruit() {
		return this.requirestempletorecruit;
	}

	public void setRequirestempletorecruit(Boolean requirestempletorecruit) {
		this.requirestempletorecruit = requirestempletorecruit;
	}

	public Integer getResearchbonus() {
		return this.researchbonus;
	}

	public void setResearchbonus(Integer researchbonus) {
		this.researchbonus = researchbonus;
	}

	public Boolean getResearchwithoutmagic() {
		return this.researchwithoutmagic;
	}

	public void setResearchwithoutmagic(Boolean researchwithoutmagic) {
		this.researchwithoutmagic = researchwithoutmagic;
	}

	public Integer getResources() {
		return this.resources;
	}

	public void setResources(Integer resources) {
		this.resources = resources;
	}

	public Integer getRessize() {
		return this.ressize;
	}

	public void setRessize(Integer ressize) {
		this.ressize = ressize;
	}

	public Integer getRpcost() {
		return this.rpcost;
	}

	public void setRpcost(Integer rpcost) {
		this.rpcost = rpcost;
	}

	public Integer getRt() {
		return this.rt;
	}

	public void setRt(Integer rt) {
		this.rt = rt;
	}

	public Integer getS() {
		return this.s;
	}

	public void setS(Integer s) {
		this.s = s;
	}

	public Integer getSacr() {
		return this.sacr;
	}

	public void setSacr(Integer sacr) {
		this.sacr = sacr;
	}

	public Integer getSailingmaxunitsize() {
		return this.sailingmaxunitsize;
	}

	public void setSailingmaxunitsize(Integer sailingmaxunitsize) {
		this.sailingmaxunitsize = sailingmaxunitsize;
	}

	public Integer getSailingshipsize() {
		return this.sailingshipsize;
	}

	public void setSailingshipsize(Integer sailingshipsize) {
		this.sailingshipsize = sailingshipsize;
	}

	public Integer getSailsize() {
		return this.sailsize;
	}

	public void setSailsize(Integer sailsize) {
		this.sailsize = sailsize;
	}

	public Boolean getScalewalls() {
		return this.scalewalls;
	}

	public void setScalewalls(Boolean scalewalls) {
		this.scalewalls = scalewalls;
	}

	public Integer getSecondshape() {
		return this.secondshape;
	}

	public void setSecondshape(Integer secondshape) {
		this.secondshape = secondshape;
	}

	public Integer getSecondtmpshape() {
		return this.secondtmpshape;
	}

	public void setSecondtmpshape(Integer secondtmpshape) {
		this.secondtmpshape = secondtmpshape;
	}

	public Integer getSeduce() {
		return this.seduce;
	}

	public void setSeduce(Integer seduce) {
		this.seduce = seduce;
	}

	public Integer getSendlesserhorrormult() {
		return this.sendlesserhorrormult;
	}

	public void setSendlesserhorrormult(Integer sendlesserhorrormult) {
		this.sendlesserhorrormult = sendlesserhorrormult;
	}

	public Integer getShapechange() {
		return this.shapechange;
	}

	public void setShapechange(Integer shapechange) {
		this.shapechange = shapechange;
	}

	public Integer getShatteredsoul() {
		return this.shatteredsoul;
	}

	public void setShatteredsoul(Integer shatteredsoul) {
		this.shatteredsoul = shatteredsoul;
	}

	public Integer getShockres() {
		return this.shockres;
	}

	public void setShockres(Integer shockres) {
		this.shockres = shockres;
	}

	public Integer getShrinkhp() {
		return this.shrinkhp;
	}

	public void setShrinkhp(Integer shrinkhp) {
		this.shrinkhp = shrinkhp;
	}

	public Integer getSiegebonus() {
		return this.siegebonus;
	}

	public void setSiegebonus(Integer siegebonus) {
		this.siegebonus = siegebonus;
	}

	public Integer getSize() {
		return this.size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public Boolean getSlashres() {
		return this.slashres;
	}

	public void setSlashres(Boolean slashres) {
		this.slashres = slashres;
	}

	public Integer getSlave() {
		return this.slave;
	}

	public void setSlave(Integer slave) {
		this.slave = slave;
	}

	public Integer getSleepaura() {
		return this.sleepaura;
	}

	public void setSleepaura(Integer sleepaura) {
		this.sleepaura = sleepaura;
	}

	public Integer getSlimer() {
		return this.slimer;
	}

	public void setSlimer(Integer slimer) {
		this.slimer = slimer;
	}

	public Integer getSlothresearch() {
		return this.slothresearch;
	}

	public void setSlothresearch(Integer slothresearch) {
		this.slothresearch = slothresearch;
	}

	public Integer getSnaketattoo() {
		return this.snaketattoo;
	}

	public void setSnaketattoo(Integer snaketattoo) {
		this.snaketattoo = snaketattoo;
	}

	public Boolean getSnowmove() {
		return this.snowmove;
	}

	public void setSnowmove(Boolean snowmove) {
		this.snowmove = snowmove;
	}

	public Integer getSorceryrange() {
		return this.sorceryrange;
	}

	public void setSorceryrange(Integer sorceryrange) {
		this.sorceryrange = sorceryrange;
	}

	public Boolean getSpecial() {
		return this.special;
	}

	public void setSpecial(Boolean special) {
		this.special = special;
	}

	public Integer getSpeciallook() {
		return this.speciallook;
	}

	public void setSpeciallook(Integer speciallook) {
		this.speciallook = speciallook;
	}

	public Boolean getSpellsinging() {
		return this.spellsinging;
	}

	public void setSpellsinging(Boolean spellsinging) {
		this.spellsinging = spellsinging;
	}

	public Boolean getSpiritsight() {
		return this.spiritsight;
	}

	public void setSpiritsight(Boolean spiritsight) {
		this.spiritsight = spiritsight;
	}

	public Boolean getSpreadchaos() {
		return this.spreadchaos;
	}

	public void setSpreadchaos(Boolean spreadchaos) {
		this.spreadchaos = spreadchaos;
	}

	public Boolean getSpreaddeath() {
		return this.spreaddeath;
	}

	public void setSpreaddeath(Boolean spreaddeath) {
		this.spreaddeath = spreaddeath;
	}

	public Boolean getSpreaddom() {
		return this.spreaddom;
	}

	public void setSpreaddom(Boolean spreaddom) {
		this.spreaddom = spreaddom;
	}

	public Boolean getSpreadgrowth() {
		return this.spreadgrowth;
	}

	public void setSpreadgrowth(Boolean spreadgrowth) {
		this.spreadgrowth = spreadgrowth;
	}

	public Boolean getSpreadorder() {
		return this.spreadorder;
	}

	public void setSpreadorder(Boolean spreadorder) {
		this.spreadorder = spreadorder;
	}

	public Integer getSpringpower() {
		return this.springpower;
	}

	public void setSpringpower(Integer springpower) {
		this.springpower = springpower;
	}

	public Boolean getSpy() {
		return this.spy;
	}

	public void setSpy(Boolean spy) {
		this.spy = spy;
	}

	public Boolean getStandard() {
		return this.standard;
	}

	public void setStandard(Boolean standard) {
		this.standard = standard;
	}

	public Boolean getStartaff() {
		return this.startaff;
	}

	public void setStartaff(Boolean startaff) {
		this.startaff = startaff;
	}

	public Integer getStartaffliction() {
		return this.startaffliction;
	}

	public void setStartaffliction(Integer startaffliction) {
		this.startaffliction = startaffliction;
	}

	public Integer getStartage() {
		return this.startage;
	}

	public void setStartage(Integer startage) {
		this.startage = startage;
	}

	public Integer getStartagemodifier() {
		return this.startagemodifier;
	}

	public void setStartagemodifier(Integer startagemodifier) {
		this.startagemodifier = startagemodifier;
	}

	public Integer getStartdom() {
		return this.startdom;
	}

	public void setStartdom(Integer startdom) {
		this.startdom = startdom;
	}

	public Integer getStartingaff() {
		return this.startingaff;
	}

	public void setStartingaff(Integer startingaff) {
		this.startingaff = startingaff;
	}

	public Boolean getStartitem() {
		return this.startitem;
	}

	public void setStartitem(Boolean startitem) {
		this.startitem = startitem;
	}

	public Integer getStealthy() {
		return this.stealthy;
	}

	public void setStealthy(Integer stealthy) {
		this.stealthy = stealthy;
	}

	public Boolean getStonebeing() {
		return this.stonebeing;
	}

	public void setStonebeing(Boolean stonebeing) {
		this.stonebeing = stonebeing;
	}

	public Boolean getStormimmune() {
		return this.stormimmune;
	}

	public void setStormimmune(Boolean stormimmune) {
		this.stormimmune = stormimmune;
	}

	public Integer getStormpower() {
		return this.stormpower;
	}

	public void setStormpower(Integer stormpower) {
		this.stormpower = stormpower;
	}

	public Integer getStr() {
		return this.str;
	}

	public void setStr(Integer str) {
		this.str = str;
	}

	public Boolean getStunimmunity() {
		return this.stunimmunity;
	}

	public void setStunimmunity(Boolean stunimmunity) {
		this.stunimmunity = stunimmunity;
	}

	public Boolean getStupid() {
		return this.stupid;
	}

	public void setStupid(Boolean stupid) {
		this.stupid = stupid;
	}

	public Integer getSuccubus() {
		return this.succubus;
	}

	public void setSuccubus(Integer succubus) {
		this.succubus = succubus;
	}

	public Integer getSummerpower() {
		return this.summerpower;
	}

	public void setSummerpower(Integer summerpower) {
		this.summerpower = summerpower;
	}

	public Integer getSummon() {
		return this.summon;
	}

	public void setSummon(Integer summon) {
		this.summon = summon;
	}

	public Integer getSummon5() {
		return this.summon5;
	}

	public void setSummon5(Integer summon5) {
		this.summon5 = summon5;
	}

	public Integer getSunawe() {
		return this.sunawe;
	}

	public void setSunawe(Integer sunawe) {
		this.sunawe = sunawe;
	}

	public Integer getSupplybonus() {
		return this.supplybonus;
	}

	public void setSupplybonus(Integer supplybonus) {
		this.supplybonus = supplybonus;
	}

	public Integer getSupplysize() {
		return this.supplysize;
	}

	public void setSupplysize(Integer supplysize) {
		this.supplysize = supplysize;
	}

	public Boolean getSwampsurvival() {
		return this.swampsurvival;
	}

	public void setSwampsurvival(Boolean swampsurvival) {
		this.swampsurvival = swampsurvival;
	}

	public Integer getSwarmbody() {
		return this.swarmbody;
	}

	public void setSwarmbody(Integer swarmbody) {
		this.swarmbody = swarmbody;
	}

	public Boolean getSwimming() {
		return this.swimming;
	}

	public void setSwimming(Boolean swimming) {
		this.swimming = swimming;
	}

	public Integer getTaskmaster() {
		return this.taskmaster;
	}

	public void setTaskmaster(Integer taskmaster) {
		this.taskmaster = taskmaster;
	}

	public Boolean getTaxcollector() {
		return this.taxcollector;
	}

	public void setTaxcollector(Boolean taxcollector) {
		this.taxcollector = taxcollector;
	}

	public Boolean getTeleport() {
		return this.teleport;
	}

	public void setTeleport(Boolean teleport) {
		this.teleport = teleport;
	}

	public Integer getTemplesummon() {
		return this.templesummon;
	}

	public void setTemplesummon(Integer templesummon) {
		this.templesummon = templesummon;
	}

	public Boolean getTheftofthesunawe() {
		return this.theftofthesunawe;
	}

	public void setTheftofthesunawe(Boolean theftofthesunawe) {
		this.theftofthesunawe = theftofthesunawe;
	}

	public Integer getThronekill() {
		return this.thronekill;
	}

	public void setThronekill(Integer thronekill) {
		this.thronekill = thronekill;
	}

	public Boolean getTrample() {
		return this.trample;
	}

	public void setTrample(Boolean trample) {
		this.trample = trample;
	}

	public Boolean getTrampswallow() {
		return this.trampswallow;
	}

	public void setTrampswallow(Boolean trampswallow) {
		this.trampswallow = trampswallow;
	}

	public Integer getTransformation() {
		return this.transformation;
	}

	public void setTransformation(Integer transformation) {
		this.transformation = transformation;
	}

	public Boolean getTriple3mon() {
		return this.triple3mon;
	}

	public void setTriple3mon(Boolean triple3mon) {
		this.triple3mon = triple3mon;
	}

	public Integer getTriplegod() {
		return this.triplegod;
	}

	public void setTriplegod(Integer triplegod) {
		this.triplegod = triplegod;
	}

	public Integer getTriplegodmag() {
		return this.triplegodmag;
	}

	public void setTriplegodmag(Integer triplegodmag) {
		this.triplegodmag = triplegodmag;
	}

	public Integer getTurmoilsummon() {
		return this.turmoilsummon;
	}

	public void setTurmoilsummon(Integer turmoilsummon) {
		this.turmoilsummon = turmoilsummon;
	}

	public Boolean getUndead() {
		return this.undead;
	}

	public void setUndead(Boolean undead) {
		this.undead = undead;
	}

	public Integer getUndeadleader() {
		return this.undeadleader;
	}

	public void setUndeadleader(Integer undeadleader) {
		this.undeadleader = undeadleader;
	}

	public Boolean getUndisciplined() {
		return this.undisciplined;
	}

	public void setUndisciplined(Boolean undisciplined) {
		this.undisciplined = undisciplined;
	}

	public Boolean getUnify() {
		return this.unify;
	}

	public void setUnify(Boolean unify) {
		this.unify = unify;
	}

	public Integer getUnique() {
		return this.unique;
	}

	public void setUnique(Integer unique) {
		this.unique = unique;
	}

	public Integer getUnsurroundable() {
		return this.unsurroundable;
	}

	public void setUnsurroundable(Integer unsurroundable) {
		this.unsurroundable = unsurroundable;
	}

	public Boolean getUnteleportable() {
		return this.unteleportable;
	}

	public void setUnteleportable(Boolean unteleportable) {
		this.unteleportable = unteleportable;
	}

	public Boolean getUwbug() {
		return this.uwbug;
	}

	public void setUwbug(Boolean uwbug) {
		this.uwbug = uwbug;
	}

	public Integer getUwdamage() {
		return this.uwdamage;
	}

	public void setUwdamage(Integer uwdamage) {
		this.uwdamage = uwdamage;
	}

	public Integer getUwheataura() {
		return this.uwheataura;
	}

	public void setUwheataura(Integer uwheataura) {
		this.uwheataura = uwheataura;
	}

	public Integer getUwregen() {
		return this.uwregen;
	}

	public void setUwregen(Integer uwregen) {
		this.uwregen = uwregen;
	}

	public Integer getVineshield() {
		return this.vineshield;
	}

	public void setVineshield(Integer vineshield) {
		this.vineshield = vineshield;
	}

	public Integer getVoidsanity() {
		return this.voidsanity;
	}

	public void setVoidsanity(Integer voidsanity) {
		this.voidsanity = voidsanity;
	}

	public Integer getVoidsum() {
		return this.voidsum;
	}

	public void setVoidsum(Integer voidsum) {
		this.voidsum = voidsum;
	}

	public Integer getW() {
		return this.w;
	}

	public void setW(Integer w) {
		this.w = w;
	}

	public Boolean getWastesurvival() {
		return this.wastesurvival;
	}

	public void setWastesurvival(Boolean wastesurvival) {
		this.wastesurvival = wastesurvival;
	}

	public Integer getWaterattuned() {
		return this.waterattuned;
	}

	public void setWaterattuned(Integer waterattuned) {
		this.waterattuned = waterattuned;
	}

	public Integer getWaterbreathing() {
		return this.waterbreathing;
	}

	public void setWaterbreathing(Integer waterbreathing) {
		this.waterbreathing = waterbreathing;
	}

	public Integer getWatershape() {
		return this.watershape;
	}

	public void setWatershape(Integer watershape) {
		this.watershape = watershape;
	}

	public Integer getWinterpower() {
		return this.winterpower;
	}

	public void setWinterpower(Integer winterpower) {
		this.winterpower = winterpower;
	}

	public Integer getWolftattoo() {
		return this.wolftattoo;
	}

	public void setWolftattoo(Integer wolftattoo) {
		this.wolftattoo = wolftattoo;
	}

	public Integer getXploss() {
		return this.xploss;
	}

	public void setXploss(Integer xploss) {
		this.xploss = xploss;
	}

	public Integer getXpshape() {
		return this.xpshape;
	}

	public void setXpshape(Integer xpshape) {
		this.xpshape = xpshape;
	}

}