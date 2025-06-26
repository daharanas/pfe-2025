package ma.eai.titre.manex.batchs.ChargCoursAutoBam.xmlMapping;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementWrapper;
import ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity.ChargementCoursBam;
import ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity.CoursBam;
import ma.eai.titre.manex.batchs.ChargCoursAutoBam.entity.FichierEchange;

import java.util.List;

public class Objet {
    /*
    @XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "objet")
public class Objet {

 /**
 *
 */
    public Objet() {
    }

    @XmlElementWrapper(name = "margeHistos")
    @XmlElement(name = "margeHisto")
    List<MargeHistorique> margeHistos;

    @XmlElementWrapper(name = "paramTauxModifs")
    @XmlElement(name = "paramTauxModif")
    List<Paramtauxmodif> paramTauxModifs;

    @XmlElement(name = "chargement")
    private ChargementCoursBam chargement;

    public ChargementCoursBam getChargement() {
        return chargement;
    }
    @XmlElement(name = "coursBam")
    private List<CoursBam> coursBamList;

    public List<CoursBam> getCoursBamList() {
        return coursBamList;
    }

    public void setCoursBamList(List<CoursBam> coursBamList) {
        this.coursBamList = coursBamList;
    }

    public void setChargement(ChargementCoursBam chargement) {
        this.chargement = chargement;
    }

    private OfficeChange officeChange;

    private TypeOperation typeOperation;

    @XmlElementWrapper(name = "officeChanges")
    @XmlElement(name = "officeChange")
    private List<OfficeChange> officeChanges;

    private QualiteBeneficiaire qualiteBeneficiaire;

    @XmlElementWrapper(name = "qualiteBeneficiaires")
    @XmlElement(name = "qualiteBeneficiaire")
    private List<QualiteBeneficiaire> qualiteBeneficiaires;

    //MBR<<07/01/2019
    private MvtComptable mvtComptable;

    @XmlElementWrapper(name = "mvtComptableAchats")
    @XmlElement(name = "mvtComptableAchat")
    private List<LigneMvtComptablePdf> mvtComptableAchats;

    @XmlElementWrapper(name = "mvtComptableVentes")
    @XmlElement(name = "mvtComptableVente")
    private List<LigneMvtComptablePdf> mvtComptableVentes;

    @XmlElementWrapper(name = "mvtComptableNets")
    @XmlElement(name = "mvtComptableNet")
    private List<LigneMvtComptablePdf> mvtComptableNets;


    private MvtComptableInput mvtComptableInput;

    @XmlElementWrapper(name = "mvtComptables")
    @XmlElement(name = "mvtComptable")
    private List<MvtComptable> mvtComptables;

    private BigDecimal sommeCvEsp;
    //MBR>>07/01/2019


    private FichierEchange fichierEchange;

    private FichierEchangeInput fichierEchangeInput;

    @XmlElementWrapper(name = "fichierEchanges")
    @XmlElement(name = "fichierEchange")
    private List<FichierEchange> fichierEchanges;

    @XmlElementWrapper(name = "typeFichiers")
    @XmlElement(name = "typeFichier")
    List<LabelValue> typeFichiers;

    @XmlElementWrapper(name = "labelCategories")
    @XmlElement(name = "labelCategorie")
    List<LabelValue> labelCategories;

    private Categorie categorie;

    @XmlElementWrapper(name = "categories")
    @XmlElement(name = "categorie")
    private List<Categorie> categories;

    private TransactionChange transactionChange;

    private TransactionGAD transactionGAD;

    private TransactionKYC transactionKYC;

    @XmlElement(name = "documentDto")
    private TransactionOCR transactionOCR;

    @XmlElementWrapper(name = "transactionChanges")
    @XmlElement(name = "transactionChange")
    private List<TransactionChange> transactionChanges;

    @XmlElementWrapper(name = "transactionKYCs")
    @XmlElement(name = "transactionKYC")
    private List<TransactionKYC> transactionsKYC;

    @XmlElementWrapper(name = "transactionChanges")
    @XmlElement(name = "transactionChange")
    private List<TransactionChangeDto> transactionChangeDtos;

    // @formatter:off
    @XmlElements({
            @XmlElement(name = "clientPro", type = IntermediaireAgree.class),
            @XmlElement(name = "clientPart", type = Beneficiaire.class) })
    private Beneficiaire beneficiaire;

    private IntermediaireAgree intermediaireAgree;

    @XmlElementWrapper(name = "intermediaireAgrees")
    @XmlElement(name = "intermediaireAgree")
    private List<IntermediaireAgree> intermediaireAgrees;

    @XmlElements({ @XmlElement(name = "condCpt", type = ConditionCompte.class),
            @XmlElement(name = "condCatg", type = ConditionCategorie.class) })
    private Condition condition;
    // @formatter:on

    private CompteIA compteIA;

    @XmlElementWrapper(name = "comptes")
    @XmlElement(name = "compte")
    private List<CompteIA> compteIAs;

    private String numCompte;

    @XmlElementWrapper(name = "numComptes")
    @XmlElement(name = "numCompte")
    private List<String> numComptes;

    @XmlElementWrapper(name = "idLigneValidationList")
    @XmlElement(name = "idLigneValidation")
    private List<Long> idLigneValidationList;

    private TransactionChangeFilter filter;

    private TransactionKYCFilter filterKyc;

    private TransactionChangeFilter transChangefilter;

    private SpecificationOperation specOperation;

    private SpecificationBenef specificationBenef;

    private CoursRechercheInput coursRechercheInput;

    private String numTiers;

    private String numAgrement;

    private Long idBenef;

    private String etatCoursBAM;
    private String numeroCaisse;

    private String etatCours;

    private DeviseMap devise;

    private String codeDevise;

    private String sigleDevise;

    private Date dateMarge;

    private BigDecimal tauxMargeGab;

    protected Integer numPage;

    protected String dateCours;

    private Long iddevise;

    private Long id_guichet;

    private String cod_agence;

    private String type_op;

    private Nat_opMap nat_opMap;

    private CriterePaliers criterePaliers;

    private Calendar datedeb;
    private Calendar datefin;
    private String typeoper;

    private Long id_agence;
    private String codeAgence;

    private String cdf;

    private String cdeSasDeleg;

    private String sas_changeur;

    private String typePVA;

    private String numeroGuichet;

    protected Integer pageSize;

    protected Long nbResultats;

    private String codeSasDeleg;

    private String sasUser;

    private String codeoc;

    private SasUser sasChangeur;

    private String codePays;

    private Pays Pays;
    // ////////////////////////////////////////////////////////////////////////////

    @XmlElementWrapper(name = "list_paliers")
    @XmlElement(name = "palier")
    private List<Palier> list_paliers;

    @XmlElementWrapper(name = "list_nat_op")
    @XmlElement(name = "nat_op")
    private List<Nat_opMap> list_nat_opMap;

    @XmlElementWrapper(name = "list_marge")
    @XmlElement(name = "marge")
    private List<Marge> list_margeMap;

    @XmlElementWrapper(name = "MargeCritere")
    @XmlElement(name = "Critere")
    protected List<MargeCritere> MargeCritere;

    @XmlElementWrapper(name = "TauxCritere")
    @XmlElement(name = "Critere")
    protected List<TauxCritere> TauxCritere;

    @XmlElementWrapper(name = "list_cours")
    @XmlElement(name = "cours")
    protected List<CoursChange> list_cours;

    @XmlElementWrapper(name = "list_cours")
    @XmlElement(name = "cours")
    protected List<Cours> listCours;

    /* Node de la liste des Marche */
    @XmlElementWrapper(name = "list_marge")
    @XmlElement(name = "margesGAB")
    protected List<MargesGab> list_marge;

    /* Node de la liste des Cours */
    @XmlElementWrapper(name = "listeCoursBam")
    @XmlElement(name = "CoursBam")
    protected List<CoursBamMap> listeCoursBam;

    /* Node de la liste des Devises */
    @XmlElementWrapper(name = "list_devise")
    @XmlElement(name = "devise")
    protected List<DeviseMap> list_devise;

    // //ADD IBG

    @XmlElementWrapper(name = "listCoursM")
    @XmlElement(name = "cours")
    protected List<CoursMap> listCoursM;

    @XmlElementWrapper(name = "margeDevises")
    @XmlElement(name = "margeDevise")
    private List<MargeDeviseDto> margeDevises;

    @XmlElementWrapper(name = "listCoursModif")
    @XmlElement(name = "coursModif")
    protected List<ModifCours> listCoursModif;

    private String refordremission;

    /* Node de la liste des Entreprise */
    @XmlElementWrapper(name = "entrepriseList")
    @XmlElement(name = "Entreprise")
    protected List<EntrepriseList> entrepriseList;

    /* Node des Criterers de recherche */
    @XmlElement(name = "critererecherchedotationva")
    protected CritereRechercheDotationVA critereRechercheDotationVA;

    /* Node du Resultat de la Recherche */
    @XmlElementWrapper(name = "resultordremissionlist")
    @XmlElement(name = "ordremission")
    protected List<Ordremission> listResultRechercheOrdreMission;

    @XmlElementWrapper(name = "list_agence")
    @XmlElement(name = "agence")
    protected List<Agence> list_agence;

    @XmlElementWrapper(name = "list_groupeag")
    @XmlElement(name = "groupeag")
    protected List<GroupeAgence> list_groupeag;

    @XmlElementWrapper(name = "list_directreg")
    @XmlElement(name = "directreg")
    protected List<DirectionRegion> list_directreg;

    @XmlElementWrapper(name = "list_categorie")
    @XmlElement(name = "categorie")
    protected List<Categorie> list_categorie;


    @XmlElementWrapper(name = "marches")
    @XmlElement(name = "marche")
    protected List<Marche> marches;

    @XmlElementWrapper(name = "sousMarches")
    @XmlElement(name = "sousMarche")
    protected List<SousMarche> sousMarches;

    @XmlElementWrapper(name = "agences")
    @XmlElement(name = "agence")
    protected List<Agence> agences;

    @XmlElementWrapper(name = "groupeAgences")
    @XmlElement(name = "groupeAgence")
    protected List<GroupeAgence> groupeAgences;

    @XmlElementWrapper(name = "directionRegions")
    @XmlElement(name = "directionRegion")
    protected List<DirectionRegion> directionRegions;

    @XmlElementWrapper(name = "guichets")
    @XmlElement(name = "guichet")
    protected List<Guichet> guichets;

    @XmlElementWrapper(name = "marges")
    @XmlElement(name = "marge")
    protected List<Marge> marges;

    @XmlElementWrapper(name = "plafondDotations")
    @XmlElement(name = "plafondDotation")
    protected List<PlafondDotation> plafondDotations;

    @XmlElementWrapper(name = "coupureDevises")
    @XmlElement(name = "coupureDevise")
    protected List<CoupureDevise> coupureDevises;

    @XmlElementWrapper(name = "PalierDeviseMaps")
    @XmlElement(name = "PalierDeviseMap")
    protected List<PalierDeviseMap> PalierDeviseMaps;

    protected Devise devise1;

    @XmlElementWrapper(name = "devises")
    @XmlElement(name = "devise")
    protected List<Devise> devises;

    private NiveauxDelegation niveauxDeleg;


    /*Aveneant operation sur compte devise*/
    private OperationRVDevise operationRVDevise;

    private String codeRetour;

    private String messageRetour;

    public NiveauxDelegation getNiveauxDeleg() {
        return niveauxDeleg;
    }

    public void setNiveauxDeleg(NiveauxDelegation niveauxDeleg) {
        this.niveauxDeleg = niveauxDeleg;
    }

    @XmlElementWrapper(name = "listNivDeleg")
    @XmlElement(name = "NiveauDelegation")
    protected List<NiveauxDelegation> listNivDeleg;

    public List<NiveauxDelegation> getListNivDeleg() {
        return listNivDeleg;
    }

    public void setListNivDeleg(List<NiveauxDelegation> listNivDeleg) {
        this.listNivDeleg = listNivDeleg;
    }

    public List<Palier> getList_paliers() {
        return list_paliers;
    }

    public void setList_paliers(List<Palier> list_paliers) {
        this.list_paliers = list_paliers;
    }

    protected TransactLigneDevise ligneDevise;

    @XmlElementWrapper(name = "documentExiges")
    @XmlElement(name = "documentExige")
    protected List<DocumentExige> documentExiges;

    @XmlElementWrapper(name = "campagnes")
    @XmlElement(name = "campagne")
    protected List<Campagne> campagnes;

    @XmlElementWrapper(name = "campagneObjets")
    @XmlElement(name = "campagneObjet")
    protected List<CampagneObjet> campagneObjets;

    @XmlElementWrapper(name = "camps")
    @XmlElement(name = "camp")
    List<LabelValue> camps;

    @XmlElementWrapper(name = "documentChoisis")
    @XmlElement(name = "documentChoisi")
    List<DocumentChoisi> documentChoisi;

    private FicheTiersDto ficheTiers;
    /**
     *
     */
    private CampagneFilter campagneFilter;

    private String idCaisse;

    private CaisseDto caisseDto;

    private Caisse caisse;

    private ForcageCaisse forcageCaisse;

    @XmlElementWrapper(name = "caisses")
    @XmlElement(name = "caisse")
    private List<Caisse> caisses;

    private CaisseFilter caisseFilter;

    private AjustementCaisse ajustement;

    private AffectationCaisse affectation;

    private CritereRechercheCaisse critereRechercheCaisse;

    private SituationCaisse situationCaisse;

    @XmlElementWrapper(name = "ligneDevises")
    @XmlElement(name = "ligneDevise")
    private List<TransfertLigneDevise> ligneDevises;

    @XmlElementWrapper(name = "caissesList")
    @XmlElement(name = "caisseListItem")
    private List<ResultatRechercheCaisse> ResultatRechercheCaisse;

    private ResultatRechercheCaisse resultatCaisse;

    private TransfertInterCaisse transfert;

    @XmlElementWrapper(name = "transfertList")
    @XmlElement(name = "transfert")
    private List<TransfertInterCaisse> transfertList;

    @XmlElementWrapper(name = "transferts")
    @XmlElement(name = "transfert")
    private List<TransfertInterCaisse> transferts;

    @XmlElementWrapper(name = "caissesDestList")
    @XmlElement(name = "caisseDestListItem")
    private List<ResultatRechercheCaisse> ResultatCaisseDest;

    /**
     * Pagination
     */

    private Pager pager;

    private DelegRequest delegRequest;

    private Supplee supplee;

    @XmlElementWrapper(name = "supplees")
    @XmlElement(name = "supplee")
    private List<Supplee> supplees;

    @XmlElementWrapper(name = "idLigneCessionList")
    @XmlElement(name = "idLigneCession")
    private List<String> idLigneCessionList;

    private SpecificationSituationCaisse specificationSituationCaisse;

    @XmlElementWrapper(name = "listSoldeComptableCaisse")
    @XmlElement(name = "SoldeComptableCaisse")
    protected List<SoldeComptableCaisse> listSoldeComptableCaisse;

    private FilterIA filterIA;


    /**
     * Dotation Voyage affaires
     */

    @XmlElementWrapper(name = "dotationDossiers")
    @XmlElement(name = "dotationDossier")
    private List<DotationDossier> dotationDossiers;

    @XmlElementWrapper(name = "dotationTransactions")
    @XmlElement(name = "dotationTransaction")
    private List<DotationTransaction> dotationTransactions;

    private DotationDossier dotationDossier;

    private DotationTransaction dotationTransaction;

    private DotationFilter dotationFilter;

    private DotationNote dotationNote;

    @XmlElementWrapper(name = "dotationNotes")
    @XmlElement(name = "dotationNote")
    private List<DotationNote> dotationNotes;

    private ParamTech paramTech;

    @XmlElementWrapper(name = "typeDocs")
    @XmlElement(name = "typeDoc")
    private List<LabelValue> typeDocs;

    //modif by amina
    //private DossierIrregulier dossierIrregulier;


    @XmlElementWrapper(name = "dossierIrreguliers")
    @XmlElement(name = "dossierIrregulier")
    private List<DossierIrregulier> dossierIrreguliers;

    private SopInsertInput sopInsertInput;
    private SopUpdateOutput sopUpdateOutput;

    // 05-08-2020 Modify By NOURA
    private OperationRVDeviseFilter operationRVDeviseFilter;


    @XmlElementWrapper(name = "operationRVDevises")
    @XmlElement(name = "operationRVDevise")
    private List <OperationRVDevise> operationRVDevises;
    // Fin Modif

    // 09-09-2020 Modify By NOURA
    @XmlElementWrapper(name = "operationRVDeviseCndStds")
    @XmlElement(name = "operationRVDeviseCndStd")
    private List <OperationRVDeviseCndStd> operationRVDeviseCndStds;


    @XmlElement(name = "operationRVDeviseCndStdClt")
    private OperationRVDeviseCndStdClt operationRVDeviseCndStdClt;

    private OperationRVDeviseCndStdFilter operRVDeviseCndStdFilter;
    // Fin Modif

    public List<DossierIrregulier> getDossierIrreguliers() {
        return dossierIrreguliers;
    }

    public void setDossierIrreguliers(List<DossierIrregulier> dossierIrreguliers) {
        this.dossierIrreguliers = dossierIrreguliers;
    }

    // Cash Advance
    private TransactionCashAdvance transactionCashAdv;

    @XmlElementWrapper(name = "transactionCashAdvs")
    @XmlElement(name = "transactionCashAdv")
    private List<TransactionCashAdvance> transactionCashAdvs;

    /**
     * @return the etatCoursBAM
     */
    public String getEtatCoursBAM() {
        return etatCoursBAM;
    }

    /**
     * @param etatCoursBAM
     * the etatCoursBAM to set
     */
    public void setEtatCoursBAM(String etatCoursBAM) {
        this.etatCoursBAM = etatCoursBAM;
    }

    /**
     * @return the etatCours
     */
    public String getEtatCours() {
        return etatCours;
    }

    /**
     * @param etatCours
     * the etatCours to set
     */
    public void setEtatCours(String etatCours) {
        this.etatCours = etatCours;
    }

    /**
     * @return the devise
     */
    public DeviseMap getDevise() {
        return devise;
    }

    /**
     * @param devise
     * the devise to set
     */
    public void setDevise(DeviseMap devise) {
        this.devise = devise;
    }

    /**
     * @return the codeDevise
     */
    public String getCodeDevise() {
        return codeDevise;
    }

    /**
     * @param codeDevise
     * the codeDevise to set
     */
    public void setCodeDevise(String codeDevise) {
        this.codeDevise = codeDevise;
    }

    /**
     * @return the dateMarge
     */
    public Date getDateMarge() {
        return dateMarge;
    }

    /**
     * @param dateMarge
     * the dateMarge to set
     */
    public void setDateMarge(Date dateMarge) {
        this.dateMarge = dateMarge;
    }

    /**
     * @return the tauxMargeGab
     */
    public BigDecimal getTauxMargeGab() {
        return tauxMargeGab;
    }

    /**
     * @param tauxMargeGab
     * the tauxMargeGab to set
     */
    public void setTauxMargeGab(BigDecimal tauxMargeGab) {
        this.tauxMargeGab = tauxMargeGab;
    }

    /**
     * @return the numPage
     */
    public Integer getNumPage() {
        return numPage;
    }

    /**
     * @param numPage
     * the numPage to set
     */
    public void setNumPage(Integer numPage) {
        this.numPage = numPage;
    }

    public List<TauxCritere> getTauxCritere() {
        return TauxCritere;
    }

    public void setTauxCritere(List<TauxCritere> tauxCritere) {
        TauxCritere = tauxCritere;
    }

    /**
     * @return the dateCours
     */
    public String getDateCours() {
        return dateCours;
    }

    /**
     * @param dateCours
     * the dateCours to set
     */
    public void setDateCours(String dateCours) {
        this.dateCours = dateCours;
    }

    /**
     * @return the iddevise
     */
    public Long getIddevise() {
        return iddevise;
    }

    /**
     * @param iddevise
     * the iddevise to set
     */
    public void setIddevise(Long iddevise) {
        this.iddevise = iddevise;
    }

    /**
     * @return the id_guichet
     */
    public Long getId_guichet() {
        return id_guichet;
    }

    public List<LabelValue> getLabelCategories() {
        return labelCategories;
    }

    public void setLabelCategories(List<LabelValue> labelCategories) {
        this.labelCategories = labelCategories;
    }

    /**
     * @param id_guichet
     * the id_guichet to set
     */
    public void setId_guichet(Long id_guichet) {
        this.id_guichet = id_guichet;
    }

    /**
     * @return the type_op
     */
    public String getType_op() {
        return type_op;
    }

    /**
     * @param type_op
     * the type_op to set
     */
    public void setType_op(String type_op) {
        this.type_op = type_op;
    }

    /**
     * @return the nat_opMap
     */
    public Nat_opMap getNat_opMap() {
        return nat_opMap;
    }

    /**
     * @param nat_opMap
     * the nat_opMap to set
     */
    public void setNat_opMap(Nat_opMap nat_opMap) {
        this.nat_opMap = nat_opMap;
    }

    public Long getId_agence() {
        return id_agence;
    }

    public void setId_agence(Long id_agence) {
        this.id_agence = id_agence;
    }

    public String getCodeAgence() {
        return codeAgence;
    }

    public void setCodeAgence(String codeAgence) {
        this.codeAgence = codeAgence;
    }

    /**
     * @return the list_nat_opMap
     */
    public List<Nat_opMap> getList_nat_opMap() {
        return list_nat_opMap;
    }

    /**
     * @param list_nat_opMap
     * the list_nat_opMap to set
     */
    public void setList_nat_opMap(List<Nat_opMap> list_nat_opMap) {
        this.list_nat_opMap = list_nat_opMap;
    }

    /**
     * @return the list_margeMap
     */
    public List<Marge> getList_margeMap() {
        return list_margeMap;
    }

    /**
     * @param list_margeMap
     * the list_margeMap to set
     */
    public void setList_margeMap(List<Marge> list_margeMap) {
        this.list_margeMap = list_margeMap;
    }

    public List<MargeCritere> getMargeCritere() {
        return MargeCritere;
    }

    public void setMargeCritere(List<MargeCritere> margeCritere) {
        MargeCritere = margeCritere;
    }

    /**
     * @return the list_cours
     */
    public List<CoursChange> getList_cours() {
        return list_cours;
    }

    /**
     * @param list_cours
     * the list_cours to set
     */
    public void setList_cours(List<CoursChange> list_cours) {
        this.list_cours = list_cours;
    }

    /**
     * @return the listCours
     */
    public List<Cours> getListCours() {
        return listCours;
    }

    /**
     * @param listCours
     * the listCours to set
     */
    public void setListCours(List<Cours> listCours) {
        this.listCours = listCours;
    }

    /**
     * @return the list_marge
     */
    public List<MargesGab> getList_marge() {
        return list_marge;
    }

    /**
     * @param list_marge
     * the list_marge to set
     */
    public void setList_marge(List<MargesGab> list_marge) {
        this.list_marge = list_marge;
    }

    /**
     * @return the officeChange
     */
    public OfficeChange getOfficeChange() {
        return officeChange;
    }

    /**
     * @param officeChange
     * the officeChange to set
     */
    public void setOfficeChange(OfficeChange officeChange) {
        this.officeChange = officeChange;
    }

    /**
     * @return the officeChanges
     */
    public List<OfficeChange> getOfficeChanges() {
        return officeChanges;
    }

    /**
     * @param officeChanges
     * the officeChanges to set
     */
    public void setOfficeChanges(List<OfficeChange> officeChanges) {
        this.officeChanges = officeChanges;
    }

    /**
     * @return the qualiteBeneficiaire
     */
    public QualiteBeneficiaire getQualiteBeneficiaire() {
        return qualiteBeneficiaire;
    }

    /**
     * @param qualiteBeneficiaire
     * the qualiteBeneficiaire to set
     */
    public void setQualiteBeneficiaire(QualiteBeneficiaire qualiteBeneficiaire) {
        this.qualiteBeneficiaire = qualiteBeneficiaire;
    }

    /**
     * @return the qualiteBeneficiaires
     */
    public List<QualiteBeneficiaire> getQualiteBeneficiaires() {
        return qualiteBeneficiaires;
    }

    /**
     * @param qualiteBeneficiaires
     * the qualiteBeneficiaires to set
     */
    public void setQualiteBeneficiaires(
            List<QualiteBeneficiaire> qualiteBeneficiaires) {
        this.qualiteBeneficiaires = qualiteBeneficiaires;
    }

    public FichierEchange getFichierEchange() {
        return fichierEchange;
    }

    public void setFichierEchange(FichierEchange fichierEchange) {
        this.fichierEchange = fichierEchange;
    }

    public List<FichierEchange> getFichierEchanges() {
        return fichierEchanges;
    }

    public void setFichierEchanges(List<FichierEchange> fichierEchanges) {
        this.fichierEchanges = fichierEchanges;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    /**
     * @return the transactionChange
     */
    public TransactionChange getTransactionChange() {
        return transactionChange;
    }

    /**
     * @param transactionChange
     * the transactionChange to set
     */
    public void setTransactionChange(TransactionChange transactionChange) {
        this.transactionChange = transactionChange;
    }

    /**
     * @return the transactionChanges
     */
    public List<TransactionChange> getTransactionChanges() {
        return transactionChanges;
    }

    /**
     * @param transactionChanges
     * the transactionChanges to set
     */
    public void setTransactionChanges(List<TransactionChange> transactionChanges) {
        this.transactionChanges = transactionChanges;
    }

    /**
     * @return the beneficiaire
     */
    public Beneficiaire getBeneficiaire() {
        return beneficiaire;
    }

    /**
     * @param beneficiaire
     * the beneficiaire to set
     */
    public void setBeneficiaire(Beneficiaire beneficiaire) {
        this.beneficiaire = beneficiaire;
    }

    /**
     * @return the condition
     */
    public Condition getCondition() {
        return condition;
    }

    /**
     * @param condition
     * the condition to set
     */
    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public CompteIA getCompteIA() {
        return compteIA;
    }

    public void setCompteIA(CompteIA compteIA) {
        this.compteIA = compteIA;
    }

    public List<CompteIA> getCompteIAs() {
        return compteIAs;
    }

    public void setCompteIAs(List<CompteIA> compteIAs) {
        this.compteIAs = compteIAs;
    }

    /**
     * @return the numComptes
     */
    public List<String> getNumComptes() {
        return numComptes;
    }

    /**
     * @param numComptes
     * the numComptes to set
     */
    public void setNumComptes(List<String> numComptes) {
        this.numComptes = numComptes;
    }

    /**
     * @return the listeCoursBam
     */
    public List<CoursBamMap> getListeCoursBam() {
        return listeCoursBam;
    }

    /**
     * @param listeCoursBam
     * the listeCoursBam to set
     */
    public void setListeCoursBam(List<CoursBamMap> listeCoursBam) {
        this.listeCoursBam = listeCoursBam;
    }

    /**
     * @return the list_devise
     */
    public List<DeviseMap> getList_devise() {
        return list_devise;
    }

    /**
     * @param list_devise
     * the list_devise to set
     */
    public void setList_devise(List<DeviseMap> list_devise) {
        this.list_devise = list_devise;
    }

    /**
     * @return the criterePaliers
     */
    public CriterePaliers getCriterePaliers() {
        return criterePaliers;
    }

    /**
     * @param criterePaliers
     * the criterePaliers to set
     */
    public void setCriterePaliers(CriterePaliers criterePaliers) {
        this.criterePaliers = criterePaliers;
    }

    /**
     * @return the cod_agence
     */
    public String getCod_agence() {
        return cod_agence;
    }

    /**
     * @param cod_agence
     * the cod_agence to set
     */
    public void setCod_agence(String cod_agence) {
        this.cod_agence = cod_agence;
    }

    /**
     * @return the guichet
     */

    /**
     * @return the listCoursM
     */
    public List<CoursMap> getListCoursM() {
        return listCoursM;
    }

    /**
     * @param listCoursM
     * the listCoursM to set
     */
    public void setListCoursM(List<CoursMap> listCoursM) {
        this.listCoursM = listCoursM;
    }

    /**
     * @return the sas_changeur
     */
    public String getSas_changeur() {
        return sas_changeur;
    }

    /**
     * @param sas_changeur
     * the sas_changeur to set
     */
    public void setSas_changeur(String sas_changeur) {
        this.sas_changeur = sas_changeur;
    }

    /**
     * @return the refordremission
     */
    public String getRefordremission() {
        return refordremission;
    }

    /**
     * @param refordremission
     * the refordremission to set
     */
    public void setRefordremission(String refordremission) {
        this.refordremission = refordremission;
    }

    /**
     * @return the entrepriseList
     */
    public List<EntrepriseList> getEntrepriseList() {
        return entrepriseList;
    }

    /**
     * @param entrepriseList
     * the entrepriseList to set
     */
    public void setEntrepriseList(List<EntrepriseList> entrepriseList) {
        this.entrepriseList = entrepriseList;
    }

    /**
     * @return the critereRechercheDotationVA
     */
    public CritereRechercheDotationVA getCritereRechercheDotationVA() {
        return critereRechercheDotationVA;
    }

    /**
     * @param critereRechercheDotationVA
     * the critereRechercheDotationVA to set
     */
    public void setCritereRechercheDotationVA(
            CritereRechercheDotationVA critereRechercheDotationVA) {
        this.critereRechercheDotationVA = critereRechercheDotationVA;
    }

    /**
     * @return the listResultRechercheOrdreMission
     */
    public List<Ordremission> getListResultRechercheOrdreMission() {
        return listResultRechercheOrdreMission;
    }

    /**
     * @param listResultRechercheOrdreMission
     * the listResultRechercheOrdreMission to set
     */
    public void setListResultRechercheOrdreMission(
            List<Ordremission> listResultRechercheOrdreMission) {
        this.listResultRechercheOrdreMission = listResultRechercheOrdreMission;
    }

    public List<Agence> getList_agence() {
        return list_agence;
    }

    public void setList_agence(List<Agence> list_agence) {
        this.list_agence = list_agence;
    }

    public List<Categorie> getList_categorie() {
        return list_categorie;
    }

    public void setList_categorie(List<Categorie> list_categorie) {
        this.list_categorie = list_categorie;
    }

    public List<GroupeAgence> getList_groupeag() {
        return list_groupeag;
    }

    public List<DirectionRegion> getList_directreg() {
        return list_directreg;
    }

    public void setList_directreg(List<DirectionRegion> list_directreg) {
        this.list_directreg = list_directreg;
    }

    public void setList_groupeag(List<GroupeAgence> list_groupeag) {
        this.list_groupeag = list_groupeag;
    }

    /**
     * @return the resultatCaisseDest
     */
    public List<ResultatRechercheCaisse> getResultatCaisseDest() {
        return ResultatCaisseDest;
    }

    /**
     * @param resultatCaisseDest
     * the resultatCaisseDest to set
     */
    public void setResultatCaisseDest(
            List<ResultatRechercheCaisse> resultatCaisseDest) {
        ResultatCaisseDest = resultatCaisseDest;
    }

    /**
     * @return the pager
     */
    public Pager getPager() {
        return pager;
    }

    /**
     * @param pager
     * the pager to set
     */
    public void setPager(Pager pager) {
        this.pager = pager;
    }

    public List<Marche> getMarches() {
        return marches;
    }

    public void setMarches(List<Marche> marches) {
        this.marches = marches;
    }

    public List<SousMarche> getSousMarches() {
        return sousMarches;
    }

    public void setSousMarches(List<SousMarche> sousMarches) {
        this.sousMarches = sousMarches;
    }

    public List<Categorie> getCategories() {
        return categories;
    }

    public void setCategories(List<Categorie> categories) {
        this.categories = categories;
    }

    public List<Agence> getAgences() {
        return agences;
    }

    public void setAgences(List<Agence> agences) {
        this.agences = agences;
    }

    public List<GroupeAgence> getGroupeAgences() {
        return groupeAgences;
    }

    public void setGroupeAgences(List<GroupeAgence> groupeAgences) {
        this.groupeAgences = groupeAgences;
    }

    public List<DirectionRegion> getDirectionRegions() {
        return directionRegions;
    }

    public void setDirectionRegions(List<DirectionRegion> directionRegions) {
        this.directionRegions = directionRegions;
    }

    public List<Guichet> getGuichets() {
        return guichets;
    }

    public void setGuichets(List<Guichet> guichets) {
        this.guichets = guichets;
    }

    public List<Marge> getMarges() {
        return marges;
    }

    public void setMarges(List<Marge> marges) {
        this.marges = marges;
    }

    public List<PlafondDotation> getPlafondDotations() {
        return plafondDotations;
    }

    public void setPlafondDotations(List<PlafondDotation> plafondDotations) {
        this.plafondDotations = plafondDotations;
    }

    public List<CoupureDevise> getCoupureDevises() {
        return coupureDevises;
    }

    public void setCoupureDevises(List<CoupureDevise> coupureDevises) {
        this.coupureDevises = coupureDevises;
    }

    public List<Devise> getDevises() {
        return devises;
    }

    public void setDevises(List<Devise> devises) {
        this.devises = devises;
    }

    public List<DocumentExige> getDocumentExiges() {
        return documentExiges;
    }

    public void setDocumentExiges(List<DocumentExige> documentExiges) {
        this.documentExiges = documentExiges;
    }

    /**
     * @return the campagnes
     */
    public List<Campagne> getCampagnes() {
        return campagnes;
    }

    /**
     * @param campagnes
     * the campagnes to set
     */
    public void setCampagnes(List<Campagne> campagnes) {
        this.campagnes = campagnes;
    }

    public List<CampagneObjet> getCampagneObjets() {
        return campagneObjets;
    }

    public void setCampagneObjets(List<CampagneObjet> campagneObjets) {
        this.campagneObjets = campagneObjets;
    }

    public List<LabelValue> getTypeFichiers() {
        return typeFichiers;
    }

    public void setTypeFichiers(List<LabelValue> typeFichiers) {
        this.typeFichiers = typeFichiers;
    }

    public Calendar getDatedeb() {
        return datedeb;
    }

    public void setDatedeb(Calendar datedeb) {
        this.datedeb = datedeb;
    }

    public Calendar getDatefin() {
        return datefin;
    }

    public void setDatefin(Calendar datefin) {
        this.datefin = datefin;
    }

    public String getTypeoper() {
        return typeoper;
    }

    public void setTypeoper(String typeoper) {
        this.typeoper = typeoper;
    }

    public List<ModifCours> getListCoursModif() {
        return listCoursModif;
    }

    public void setListCoursModif(List<ModifCours> listCoursModif) {
        this.listCoursModif = listCoursModif;
    }

    /**
     * @return the filter
     */
    public TransactionChangeFilter getFilter() {
        return filter;
    }

    /**
     * @param filter
     * the filter to set
     */
    public void setFilter(TransactionChangeFilter filter) {
        this.filter = filter;
    }

    /**
     * @return the specOperation
     */
    public SpecificationOperation getSpecOperation() {
        return specOperation;
    }

    /**
     * @param specOperation
     * the specOperation to set
     */
    public void setSpecOperation(SpecificationOperation specOperation) {
        this.specOperation = specOperation;
    }

    /**
     * @return the specificationBenef
     */
    public SpecificationBenef getSpecificationBenef() {
        return specificationBenef;
    }

    /**
     * @param specificationBenef
     * the specificationBenef to set
     */
    public void setSpecificationBenef(SpecificationBenef specificationBenef) {
        this.specificationBenef = specificationBenef;
    }

    /**
     * @return the devise1
     */
    public Devise getDevise1() {
        return devise1;
    }

    /**
     * @param devise1
     * the devise1 to set
     */
    public void setDevise1(Devise devise1) {
        this.devise1 = devise1;
    }

    /**
     * @return the ligneDevise
     */
    public TransactLigneDevise getLigneDevise() {
        return ligneDevise;
    }

    /**
     * @param ligneDevise
     * the ligneDevise to set
     */
    public void setLigneDevise(TransactLigneDevise ligneDevise) {
        this.ligneDevise = ligneDevise;
    }

    public FichierEchangeInput getFichierEchangeInput() {
        return fichierEchangeInput;
    }

    //MBR<<07/01/2019

    //MBR>>07/01/2019

    public void setFichierEchangeInput(FichierEchangeInput fichierEchangeInput) {
        this.fichierEchangeInput = fichierEchangeInput;
    }

    public String getSigleDevise() {
        return sigleDevise;
    }

    public void setSigleDevise(String sigleDevise) {
        this.sigleDevise = sigleDevise;
    }

    /**
     * @return the coursRechercheInput
     */
    public CoursRechercheInput getCoursRechercheInput() {
        return coursRechercheInput;
    }

    /**
     * @param coursRechercheInput
     * the coursRechercheInput to set
     */
    public void setCoursRechercheInput(CoursRechercheInput coursRechercheInput) {
        this.coursRechercheInput = coursRechercheInput;
    }

    /**
     * @return the numTiers
     */
    public String getNumTiers() {
        return numTiers;
    }

    /**
     * @param numTiers
     * the numTiers to set
     */
    public void setNumTiers(String numTiers) {
        this.numTiers = numTiers;
    }

    /**
     * @return the numAgrement
     */
    public String getNumAgrement() {
        return numAgrement;
    }

    /**
     * @param numAgrement
     * the numAgrement to set
     */
    public void setNumAgrement(String numAgrement) {
        this.numAgrement = numAgrement;
    }

    /**
     * @return the idBenef
     */
    public Long getIdBenef() {
        return idBenef;
    }

    /**
     * @param idBenef
     * the idBenef to set
     */
    public void setIdBenef(Long idBenef) {
        this.idBenef = idBenef;
    }

    /**
     * @return the camps
     */
    public List<LabelValue> getCamps() {
        return camps;
    }

    /**
     * @param camps
     * the camps to set
     */
    public void setCamps(List<LabelValue> camps) {
        this.camps = camps;
    }

    /**
     * @return the campagneFilter
     */
    public CampagneFilter getCampagneFilter() {
        return campagneFilter;
    }

    /**
     * @param campagneFilter
     * the campagneFilter to set
     */
    public void setCampagneFilter(CampagneFilter campagneFilter) {
        this.campagneFilter = campagneFilter;
    }

    /**
     * @return the documentChoisi
     */
    public List<DocumentChoisi> getDocumentChoisi() {
        return documentChoisi;
    }

    /**
     * @param documentChoisi
     * the documentChoisi to set
     */
    public void setDocumentChoisi(List<DocumentChoisi> documentChoisi) {
        this.documentChoisi = documentChoisi;
    }

    /**
     * @return the numCompte
     */
    public String getNumCompte() {
        return numCompte;
    }

    /**
     * @param numCompte
     * the numCompte to set
     */
    public void setNumCompte(String numCompte) {
        this.numCompte = numCompte;
    }

    /**
     * @return the ficheTiers
     */
    public FicheTiersDto getFicheTiers() {
        return ficheTiers;
    }

    /**
     * @param ficheTiers
     * the ficheTiers to set
     */
    public void setFicheTiers(FicheTiersDto ficheTiers) {
        this.ficheTiers = ficheTiers;
    }

    /**
     * @return the caisseFilter
     */
    public CaisseFilter getCaisseFilter() {
        return caisseFilter;
    }

    /**
     * @param caisseFilter
     * the caisseFilter to set
     */
    public void setCaisseFilter(CaisseFilter caisseFilter) {
        this.caisseFilter = caisseFilter;
    }

    /**
     * @return the caisse
     */
    public Caisse getCaisse() {
        return caisse;
    }

    /**
     * @param caisse
     * the caisse to set
     */
    public void setCaisse(Caisse caisse) {
        this.caisse = caisse;
    }

    /**
     * @return the caisses
     */
    public List<Caisse> getCaisses() {
        return caisses;
    }

    /**
     * @param caisses
     * the caisses to set
     */
    public void setCaisses(List<Caisse> caisses) {
        this.caisses = caisses;
    }

    /**
     * @return the ajustement
     */
    public AjustementCaisse getAjustement() {
        return ajustement;
    }

    /**
     * @param ajustement
     * the ajustement to set
     */
    public void setAjustement(AjustementCaisse ajustement) {
        this.ajustement = ajustement;
    }

    /**
     * @return the affectation
     */
    public AffectationCaisse getAffectation() {
        return affectation;
    }

    /**
     * @param affectation
     * the affectation to set
     */
    public void setAffectation(AffectationCaisse affectation) {
        this.affectation = affectation;
    }

    /**
     * @return the pageSize
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * @param pageSize
     * the pageSize to set
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * @return the nbResultats
     */
    public Long getNbResultats() {
        return nbResultats;
    }

    /**
     * @param nbResultats
     * the nbResultats to set
     */
    public void setNbResultats(Long nbResultats) {
        this.nbResultats = nbResultats;
    }

    /**
     * @return the critereRechercheCaisse
     */
    public CritereRechercheCaisse getCritereRechercheCaisse() {
        return critereRechercheCaisse;
    }

    /**
     * @param critereRechercheCaisse
     * the critereRechercheCaisse to set
     */
    public void setCritereRechercheCaisse(
            CritereRechercheCaisse critereRechercheCaisse) {
        this.critereRechercheCaisse = critereRechercheCaisse;
    }

    /**
     * @return the situationCaisse
     */
    public SituationCaisse getSituationCaisse() {
        return situationCaisse;
    }

    /**
     * @param situationCaisse
     * the situationCaisse to set
     */
    public void setSituationCaisse(SituationCaisse situationCaisse) {
        this.situationCaisse = situationCaisse;
    }

    /**
     * @return the transfert
     */
    public TransfertInterCaisse getTransfert() {
        return transfert;
    }

    /**
     * @param transfert
     * the transfert to set
     */
    public void setTransfert(TransfertInterCaisse transfert) {
        this.transfert = transfert;
    }

    public String getCdf() {
        return cdf;
    }

    public void setCdf(String cdf) {
        this.cdf = cdf;
    }

    public String getCdeSasDeleg() {
        return cdeSasDeleg;
    }

    public void setCdeSasDeleg(String cdeSasDeleg) {
        this.cdeSasDeleg = cdeSasDeleg;
    }

    public List<ResultatRechercheCaisse> getResultatRechercheCaisse() {
        return ResultatRechercheCaisse;
    }

    public void setResultatRechercheCaisse(
            List<ResultatRechercheCaisse> resultatRechercheCaisse) {
        ResultatRechercheCaisse = resultatRechercheCaisse;
    }

    /**
     * @return the ligneDevises
     */
    public List<TransfertLigneDevise> getLigneDevises() {
        return ligneDevises;
    }

    /**
     * @param ligneDevises
     * the ligneDevises to set
     */
    public void setLigneDevises(List<TransfertLigneDevise> ligneDevises) {
        this.ligneDevises = ligneDevises;
    }

    /**
     * @return the resultatCaisse
     */
    public ResultatRechercheCaisse getResultatCaisse() {
        return resultatCaisse;
    }

    /**
     * @param resultatCaisse
     * the resultatCaisse to set
     */
    public void setResultatCaisse(ResultatRechercheCaisse resultatCaisse) {
        this.resultatCaisse = resultatCaisse;
    }

    public String getTypePVA() {
        return typePVA;
    }

    public void setTypePVA(String typePVA) {
        this.typePVA = typePVA;
    }

    public String getNumeroGuichet() {
        return numeroGuichet;
    }

    public void setNumeroGuichet(String numeroGuichet) {
        this.numeroGuichet = numeroGuichet;
    }

    /**
     * @return the palierDeviseMaps
     */
    public List<PalierDeviseMap> getPalierDeviseMaps() {
        return PalierDeviseMaps;
    }

    public String getIdCaisse() {
        return idCaisse;
    }

    public void setIdCaisse(String idCaisse) {
        this.idCaisse = idCaisse;
    }

    /**
     * @param palierDeviseMaps
     * the palierDeviseMaps to set
     */
    public void setPalierDeviseMaps(List<PalierDeviseMap> palierDeviseMaps) {
        PalierDeviseMaps = palierDeviseMaps;
    }

    /**
     * @return the idLigneValidationList
     */
    public List<Long> getIdLigneValidationList() {
        return idLigneValidationList;
    }

    /**
     * @param idLigneValidationList
     * the idLigneValidationList to set
     */
    public void setIdLigneValidationList(List<Long> idLigneValidationList) {
        this.idLigneValidationList = idLigneValidationList;
    }

    /**
     * @return the idLigneCessionList
     */
    public List<String> getIdLigneCessionList() {
        return idLigneCessionList;
    }

    /**
     * @param idLigneCessionList
     * the idLigneCessionList to set
     */
    public void setIdLigneCessionList(List<String> idLigneCessionList) {
        this.idLigneCessionList = idLigneCessionList;
    }

    /**
     * @return the listSoldeComptableCaisse
     */
    public List<SoldeComptableCaisse> getListSoldeComptableCaisse() {
        return listSoldeComptableCaisse;
    }

    /**
     * @param listSoldeComptableCaisse
     * the listSoldeComptableCaisse to set
     */
    public void setListSoldeComptableCaisse(
            List<SoldeComptableCaisse> listSoldeComptableCaisse) {
        this.listSoldeComptableCaisse = listSoldeComptableCaisse;
    }

    /**
     * @param officeChange
     * @param officeChanges
     * @param qualiteBeneficiaire
     * @param qualiteBeneficiaires
     * @param fichierEchange
     * @param fichierEchangeInput
     * @param fichierEchanges
     * @param typeFichiers
     * @param labelCategories
     * @param categorie
     * @param categories
     * @param transactionChange
     * @param transactionChanges
     * @param beneficiaire
     * @param condition
     * @param compte
     * @param comptes
     * @param numCompte
     * @param numComptes
     * @param filter
     * @param specOperation
     * @param specificationBenef
     * @param coursRechercheInput
     * @param numTiers
     * @param numAgrement
     * @param idBenef
     * @param etatCoursBAM
     * @param etatCours
     * @param devise
     * @param codeDevise
     * @param sigleDevise
     * @param dateMarge
     * @param tauxMargeGab
     * @param numPage
     * @param dateCours
     * @param iddevise
     * @param id_guichet
     * @param cod_agence
     * @param type_op
     * @param nat_opMap
     * @param criterePaliers
     * @param datedeb
     * @param datefin
     * @param typeoper
     * @param id_agence
     * @param codeAgence
     * @param cdf
     * @param cdeSasDeleg
     * @param sas_changeur
     * @param typePVA
     * @param numeroGuichet
     * @param pageSize
     * @param nbResultats
     * @param list_paliers
     * @param list_nat_opMap
     * @param list_margeMap
     * @param margeCritere
     * @param tauxCritere
     * @param list_cours
     * @param listCours
     * @param list_marge
     * @param listeCoursBam
     * @param list_devise
     * @param listCoursM
     * @param listCoursModif
     * @param refordremission
     * @param entrepriseList
     * @param critereRechercheDotationVA
     * @param listResultRechercheOrdreMission
     * @param list_agence
     * @param list_groupeag
     * @param list_directreg
     * @param list_categorie
     * @param list_groupeag2
     * @param marches
     * @param sousMarches
     * @param agences
     * @param groupeAgences
     * @param directionRegions
     * @param guichets
     * @param marges
     * @param plafondDotations
     * @param coupureDevises
     * @param devise1
     * @param devises
     * @param niveauxDeleg
     * @param listNivDeleg
     * @param ligneDevise
     * @param documentExiges
     * @param campagnes
     * @param camps
     * @param documentChoisi
     * @param ficheTiers
     * @param campagneFilter
     * @param idCaisse
     * @param caisse
     * @param caisses
     * @param caisseFilter
     * @param ajustement
     * @param affectation
     * @param critereRechercheCaisse
     * @param situationCaisse
     * @param transfert
     * @param ligneDevises
     * @param resultatRechercheCaisse
     * @param resultatCaisse
     * @param pager
     */
    public Objet(OfficeChange officeChange, List<OfficeChange> officeChanges,
                 QualiteBeneficiaire qualiteBeneficiaire,
                 List<QualiteBeneficiaire> qualiteBeneficiaires,
                 FichierEchange fichierEchange,
                 FichierEchangeInput fichierEchangeInput,
                 List<FichierEchange> fichierEchanges,
                 List<LabelValue> typeFichiers, List<LabelValue> labelCategories,
                 Categorie categorie, List<Categorie> categories,
                 TransactionChange transactionChange,
                 List<TransactionChange> transactionChanges,
                 Beneficiaire beneficiaire, Condition condition, CompteIA compte,
                 List<CompteIA> comptes, String numCompte, List<String> numComptes,
                 TransactionChangeFilter filter,
                 SpecificationOperation specOperation,
                 SpecificationBenef specificationBenef,
                 CoursRechercheInput coursRechercheInput, String numTiers,
                 String numAgrement, Long idBenef, String etatCoursBAM,
                 String etatCours, DeviseMap devise, String codeDevise,
                 String sigleDevise, Date dateMarge, BigDecimal tauxMargeGab,
                 Integer numPage, String dateCours, long iddevise, long id_guichet,
                 String cod_agence, String type_op, Nat_opMap nat_opMap,
                 CriterePaliers criterePaliers, Calendar datedeb, Calendar datefin,
                 String typeoper, long id_agence, String codeAgence, String cdf,
                 String cdeSasDeleg, String sas_changeur, String typePVA,
                 String numeroGuichet, Integer pageSize, Long nbResultats,
                 List<Palier> list_paliers, List<Nat_opMap> list_nat_opMap,
                 List<Marge> list_margeMap,
                 List<ma.eai.titres.manex.xmlmapping.MargeCritere> margeCritere,
                 List<ma.eai.titres.manex.xmlmapping.TauxCritere> tauxCritere,
                 List<CoursChange> list_cours, List<Cours> listCours,
                 List<MargesGab> list_marge, List<CoursBamMap> listeCoursBam,
                 List<DeviseMap> list_devise, List<CoursMap> listCoursM,
                 List<ModifCours> listCoursModif, String refordremission,
                 List<EntrepriseList> entrepriseList,
                 CritereRechercheDotationVA critereRechercheDotationVA,
                 List<Ordremission> listResultRechercheOrdreMission,
                 List<Agence> list_agence, List<GroupeAgence> list_groupeag,
                 List<DirectionRegion> list_directreg,
                 List<Categorie> list_categorie, List<GroupeAgence> list_groupeag2,
                 List<Marche> marches, List<SousMarche> sousMarches,
                 List<Agence> agences, List<GroupeAgence> groupeAgences,
                 List<DirectionRegion> directionRegions, List<Guichet> guichets,
                 List<Marge> marges, List<PlafondDotation> plafondDotations,
                 List<CoupureDevise> coupureDevises, Devise devise1,
                 List<Devise> devises, NiveauxDelegation niveauxDeleg,
                 List<NiveauxDelegation> listNivDeleg,
                 TransactLigneDevise ligneDevise,
                 List<DocumentExige> documentExiges, List<Campagne> campagnes,
                 List<LabelValue> camps, List<DocumentChoisi> documentChoisi,
                 FicheTiersDto ficheTiers, CampagneFilter campagneFilter,
                 String idCaisse, Caisse caisse, List<Caisse> caisses,
                 CaisseFilter caisseFilter, AjustementCaisse ajustement,
                 AffectationCaisse affectation,
                 CritereRechercheCaisse critereRechercheCaisse,
                 SituationCaisse situationCaisse, TransfertInterCaisse transfert,
                 List<TransfertLigneDevise> ligneDevises,
                 List<ResultatRechercheCaisse> resultatRechercheCaisse,
                 ResultatRechercheCaisse resultatCaisse,
                 List<TransfertInterCaisse> transfertList,
                 List<ResultatRechercheCaisse> ResultatCaisseDest, Pager pager,
                 List<String> idLigneCessionList,
                 List<SoldeComptableCaisse> listSoldeComptableCaisse) {
        super();
        this.officeChange = officeChange;
        this.officeChanges = officeChanges;
        this.qualiteBeneficiaire = qualiteBeneficiaire;
        this.qualiteBeneficiaires = qualiteBeneficiaires;
        this.fichierEchange = fichierEchange;
        this.fichierEchangeInput = fichierEchangeInput;
        this.fichierEchanges = fichierEchanges;
        this.typeFichiers = typeFichiers;
        this.labelCategories = labelCategories;
        this.categorie = categorie;
        this.categories = categories;
        this.transactionChange = transactionChange;
        this.transactionChanges = transactionChanges;
        this.beneficiaire = beneficiaire;
        this.condition = condition;
        this.compteIA = compte;
        this.compteIAs = comptes;
        this.numCompte = numCompte;
        this.numComptes = numComptes;
        this.filter = filter;
        this.specOperation = specOperation;
        this.specificationBenef = specificationBenef;
        this.coursRechercheInput = coursRechercheInput;
        this.numTiers = numTiers;
        this.numAgrement = numAgrement;
        this.idBenef = idBenef;
        this.etatCoursBAM = etatCoursBAM;
        this.etatCours = etatCours;
        this.devise = devise;
        this.codeDevise = codeDevise;
        this.sigleDevise = sigleDevise;
        this.dateMarge = dateMarge;
        this.tauxMargeGab = tauxMargeGab;
        this.numPage = numPage;
        this.dateCours = dateCours;
        this.iddevise = iddevise;
        this.id_guichet = id_guichet;
        this.cod_agence = cod_agence;
        this.type_op = type_op;
        this.nat_opMap = nat_opMap;
        this.criterePaliers = criterePaliers;
        this.datedeb = datedeb;
        this.datefin = datefin;
        this.typeoper = typeoper;
        this.id_agence = id_agence;
        this.codeAgence = codeAgence;
        this.cdf = cdf;
        this.cdeSasDeleg = cdeSasDeleg;
        this.sas_changeur = sas_changeur;
        this.typePVA = typePVA;
        this.numeroGuichet = numeroGuichet;
        this.pageSize = pageSize;
        this.nbResultats = nbResultats;
        this.list_paliers = list_paliers;
        this.list_nat_opMap = list_nat_opMap;
        this.list_margeMap = list_margeMap;
        MargeCritere = margeCritere;
        TauxCritere = tauxCritere;
        this.list_cours = list_cours;
        this.listCours = listCours;
        this.list_marge = list_marge;
        this.listeCoursBam = listeCoursBam;
        this.list_devise = list_devise;
        this.listCoursM = listCoursM;
        this.listCoursModif = listCoursModif;
        this.refordremission = refordremission;
        this.entrepriseList = entrepriseList;
        this.critereRechercheDotationVA = critereRechercheDotationVA;
        this.listResultRechercheOrdreMission = listResultRechercheOrdreMission;
        this.list_agence = list_agence;
        this.list_groupeag = list_groupeag;
        this.list_directreg = list_directreg;
        this.list_categorie = list_categorie;
        this.marches = marches;
        this.sousMarches = sousMarches;
        this.agences = agences;
        this.groupeAgences = groupeAgences;
        this.directionRegions = directionRegions;
        this.guichets = guichets;
        this.marges = marges;
        this.plafondDotations = plafondDotations;
        this.coupureDevises = coupureDevises;
        this.devise1 = devise1;
        this.devises = devises;
        this.niveauxDeleg = niveauxDeleg;
        this.listNivDeleg = listNivDeleg;
        this.ligneDevise = ligneDevise;
        this.documentExiges = documentExiges;
        this.campagnes = campagnes;
        this.camps = camps;
        this.documentChoisi = documentChoisi;
        this.ficheTiers = ficheTiers;
        this.campagneFilter = campagneFilter;
        this.idCaisse = idCaisse;
        this.caisse = caisse;
        this.caisses = caisses;
        this.caisseFilter = caisseFilter;
        this.ajustement = ajustement;
        this.affectation = affectation;
        this.critereRechercheCaisse = critereRechercheCaisse;
        this.situationCaisse = situationCaisse;
        this.transfert = transfert;
        this.transfertList = transfertList;
        this.ligneDevises = ligneDevises;
        ResultatRechercheCaisse = resultatRechercheCaisse;
        this.resultatCaisse = resultatCaisse;
        this.ResultatCaisseDest = ResultatCaisseDest;
        this.pager = pager;
        this.idLigneCessionList = idLigneCessionList;
        this.listSoldeComptableCaisse = listSoldeComptableCaisse;
    }

    @Override
    public String toString() {
        return "Objet ["
                + (officeChange != null ? "officeChange=" + officeChange + ", "
                : "")
                + (officeChanges != null ? "officeChanges=" + officeChanges
                + ", " : "")
                + (qualiteBeneficiaire != null ? "qualiteBeneficiaire="
                + qualiteBeneficiaire + ", " : "")
                + (qualiteBeneficiaires != null ? "qualiteBeneficiaires="
                + qualiteBeneficiaires + ", " : "")
                + (fichierEchange != null ? "fichierEchange=" + fichierEchange
                + ", " : "")
                + (fichierEchangeInput != null ? "fichierEchangeInput="
                + fichierEchangeInput + ", " : "")
                + (fichierEchanges != null ? "fichierEchanges="
                + fichierEchanges + ", " : "")
                + (typeFichiers != null ? "typeFichiers=" + typeFichiers + ", "
                : "")
                + (labelCategories != null ? "labelCategories="
                + labelCategories + ", " : "")
                + (categorie != null ? "categorie=" + categorie + ", " : "")
                + (categories != null ? "categories=" + categories + ", " : "")
                + (transactionChange != null ? "transactionChange="
                + transactionChange + ", " : "")
                + (transactionChanges != null ? "transactionChanges="
                + transactionChanges + ", " : "")
                + (beneficiaire != null ? "beneficiaire=" + beneficiaire + ", "
                : "")
                + (condition != null ? "condition=" + condition + ", " : "")
                + (compteIA != null ? "compte=" + compteIA + ", " : "")
                + (compteIAs != null ? "comptes=" + compteIAs + ", " : "")
                + (numCompte != null ? "numCompte=" + numCompte + ", " : "")
                + (numComptes != null ? "numComptes=" + numComptes + ", " : "")
                + (filter != null ? "filter=" + filter + ", " : "")
                + (specOperation != null ? "specOperation=" + specOperation
                + ", " : "")
                + (specificationBenef != null ? "specificationBenef="
                + specificationBenef + ", " : "")
                + (coursRechercheInput != null ? "coursRechercheInput="
                + coursRechercheInput + ", " : "")
                + (numTiers != null ? "numTiers=" + numTiers + ", " : "")
                + (numAgrement != null ? "numAgrement=" + numAgrement + ", "
                : "")
                + (idBenef != null ? "idBenef=" + idBenef + ", " : "")
                + (etatCoursBAM != null ? "etatCoursBAM=" + etatCoursBAM + ", "
                : "")
                + (etatCours != null ? "etatCours=" + etatCours + ", " : "")
                + (devise != null ? "devise=" + devise + ", " : "")
                + (codeDevise != null ? "codeDevise=" + codeDevise + ", " : "")
                + (sigleDevise != null ? "sigleDevise=" + sigleDevise + ", "
                : "")
                + (dateMarge != null ? "dateMarge=" + dateMarge + ", " : "")
                + (tauxMargeGab != null ? "tauxMargeGab=" + tauxMargeGab + ", "
                : "")
                + (numPage != null ? "numPage=" + numPage + ", " : "")
                + (dateCours != null ? "dateCours=" + dateCours + ", " : "")
                + "iddevise="
                + iddevise
                + ", id_guichet="
                + id_guichet
                + ", "
                + (cod_agence != null ? "cod_agence=" + cod_agence + ", " : "")
                + (type_op != null ? "type_op=" + type_op + ", " : "")
                + (nat_opMap != null ? "nat_opMap=" + nat_opMap + ", " : "")
                + (criterePaliers != null ? "criterePaliers=" + criterePaliers
                + ", " : "")
                + (datedeb != null ? "datedeb=" + datedeb + ", " : "")
                + (datefin != null ? "datefin=" + datefin + ", " : "")
                + (typeoper != null ? "typeoper=" + typeoper + ", " : "")
                + "id_agence="
                + id_agence
                + ", "
                + (codeAgence != null ? "codeAgence=" + codeAgence + ", " : "")
                + (cdf != null ? "cdf=" + cdf + ", " : "")
                + (cdeSasDeleg != null ? "cdeSasDeleg=" + cdeSasDeleg + ", "
                : "")
                + (sas_changeur != null ? "sas_changeur=" + sas_changeur + ", "
                : "")
                + (typePVA != null ? "typePVA=" + typePVA + ", " : "")
                + (numeroGuichet != null ? "numeroGuichet=" + numeroGuichet
                + ", " : "")
                + (pageSize != null ? "pageSize=" + pageSize + ", " : "")
                + (nbResultats != null ? "nbResultats=" + nbResultats + ", "
                : "")
                + (list_paliers != null ? "list_paliers=" + list_paliers + ", "
                : "")
                + (list_nat_opMap != null ? "list_nat_opMap=" + list_nat_opMap
                + ", " : "")
                + (list_margeMap != null ? "list_margeMap=" + list_margeMap
                + ", " : "")
                + (MargeCritere != null ? "MargeCritere=" + MargeCritere + ", "
                : "")
                + (TauxCritere != null ? "TauxCritere=" + TauxCritere + ", "
                : "")
                + (list_cours != null ? "list_cours=" + list_cours + ", " : "")
                + (listCours != null ? "listCours=" + listCours + ", " : "")
                + (list_marge != null ? "list_marge=" + list_marge + ", " : "")
                + (listeCoursBam != null ? "listeCoursBam=" + listeCoursBam
                + ", " : "")
                + (list_devise != null ? "list_devise=" + list_devise + ", "
                : "")
                + (listCoursM != null ? "listCoursM=" + listCoursM + ", " : "")
                + (listCoursModif != null ? "listCoursModif=" + listCoursModif
                + ", " : "")
                + (refordremission != null ? "refordremission="
                + refordremission + ", " : "")
                + (entrepriseList != null ? "entrepriseList=" + entrepriseList
                + ", " : "")
                + (critereRechercheDotationVA != null ? "critereRechercheDotationVA="
                + critereRechercheDotationVA + ", "
                : "")
                + (listResultRechercheOrdreMission != null ? "listResultRechercheOrdreMission="
                + listResultRechercheOrdreMission + ", "
                : "")
                + (list_agence != null ? "list_agence=" + list_agence + ", "
                : "")
                + (list_groupeag != null ? "list_groupeag=" + list_groupeag
                + ", " : "")
                + (list_directreg != null ? "list_directreg=" + list_directreg
                + ", " : "")
                + (list_categorie != null ? "list_categorie=" + list_categorie
                + ", " : "")
                + (marches != null ? "marches=" + marches + ", " : "")
                + (sousMarches != null ? "sousMarches=" + sousMarches + ", "
                : "")
                + (agences != null ? "agences=" + agences + ", " : "")
                + (groupeAgences != null ? "groupeAgences=" + groupeAgences
                + ", " : "")
                + (directionRegions != null ? "directionRegions="
                + directionRegions + ", " : "")
                + (guichets != null ? "guichets=" + guichets + ", " : "")
                + (marges != null ? "marges=" + marges + ", " : "")
                + (plafondDotations != null ? "plafondDotations="
                + plafondDotations + ", " : "")
                + (coupureDevises != null ? "coupureDevises=" + coupureDevises
                + ", " : "")
                + (devise1 != null ? "devise1=" + devise1 + ", " : "")
                + (devises != null ? "devises=" + devises + ", " : "")
                + (niveauxDeleg != null ? "niveauxDeleg=" + niveauxDeleg + ", "
                : "")
                + (listNivDeleg != null ? "listNivDeleg=" + listNivDeleg + ", "
                : "")
                + (ligneDevise != null ? "ligneDevise=" + ligneDevise + ", "
                : "")
                + (documentExiges != null ? "documentExiges=" + documentExiges
                + ", " : "")
                + (campagnes != null ? "campagnes=" + campagnes + ", " : "")
                + (camps != null ? "camps=" + camps + ", " : "")
                + (documentChoisi != null ? "documentChoisi=" + documentChoisi
                + ", " : "")
                + (ficheTiers != null ? "ficheTiers=" + ficheTiers + ", " : "")
                + (campagneFilter != null ? "campagneFilter=" + campagneFilter
                + ", " : "")

                + (idCaisse != null ? "idCaisse=" + idCaisse + ", " : "")

                + (caisse != null ? "caisse=" + caisse + ", " : "")
                + (caisses != null ? "caisses=" + caisses + ", " : "")
                + (caisseFilter != null ? "caisseFilter=" + caisseFilter + ", "
                : "")
                + (ajustement != null ? "ajustement=" + ajustement + ", " : "")
                + (affectation != null ? "affectation=" + affectation + ", "
                : "")
                + (critereRechercheCaisse != null ? "critereRechercheCaisse="
                + critereRechercheCaisse + ", " : "")
                + (situationCaisse != null ? "situationCaisse="
                + situationCaisse + ", " : "")
                + (transfert != null ? "transfert=" + transfert + ", " : "")
                + (ligneDevises != null ? "ligneDevises=" + ligneDevises + ", "
                : "")
                + (ResultatRechercheCaisse != null ? "ResultatRechercheCaisse="
                + ResultatRechercheCaisse + ", " : "")
                + (resultatCaisse != null ? "resultatCaisse=" + resultatCaisse
                + ", " : "") + (pager != null ? "pager=" + pager : "")
                + "]";
    }

    /**
     * @return the transChangefilter
     */
    public TransactionChangeFilter getTransChangefilter() {
        return transChangefilter;
    }

    /**
     * @param transChangefilter
     * the transChangefilter to set
     */
    public void setTransChangefilter(TransactionChangeFilter transChangefilter) {
        this.transChangefilter = transChangefilter;
    }

    /**
     * @return the codeSasDeleg
     */
    public String getCodeSasDeleg() {
        return codeSasDeleg;
    }

    /**
     * @param codeSasDeleg
     * the codeSasDeleg to set
     */
    public void setCodeSasDeleg(String codeSasDeleg) {
        this.codeSasDeleg = codeSasDeleg;
    }

    /**
     * @return the delegRequest
     */
    public DelegRequest getDelegRequest() {
        return delegRequest;
    }

    /**
     * @param delegRequest
     * the delegRequest to set
     */
    public void setDelegRequest(DelegRequest delegRequest) {
        this.delegRequest = delegRequest;
    }

    /**
     * @return the supplee
     */
    public Supplee getSupplee() {
        return supplee;
    }

    /**
     * @param supplee
     * the supplee to set
     */
    public void setSupplee(Supplee supplee) {
        this.supplee = supplee;
    }

    /**
     * @return the supplees
     */
    public List<Supplee> getSupplees() {
        return supplees;
    }

    /**
     * @param supplees
     * the supplees to set
     */
    public void setSupplees(List<Supplee> supplees) {
        this.supplees = supplees;
    }

    /**
     * @return the sasUser
     */
    public String getSasUser() {
        return sasUser;
    }

    /**
     * @param sasUser
     * the sasUser to set
     */
    public void setSasUser(String sasUser) {
        this.sasUser = sasUser;
    }

    /**
     * @return the specificationSituationCaisse
     */
    public SpecificationSituationCaisse getSpecificationSituationCaisse() {
        return specificationSituationCaisse;
    }

    /**
     * @param specificationSituationCaisse
     * the specificationSituationCaisse to set
     */
    public void setSpecificationSituationCaisse(
            SpecificationSituationCaisse specificationSituationCaisse) {
        this.specificationSituationCaisse = specificationSituationCaisse;
    }

    /**
     * @return the transactionChangeDtos
     */
    public List<TransactionChangeDto> getTransactionChangeDtos() {
        return transactionChangeDtos;
    }

    /**
     * @param transactionChangeDtos
     * the transactionChangeDtos to set
     */
    public void setTransactionChangeDtos(
            List<TransactionChangeDto> transactionChangeDtos) {
        this.transactionChangeDtos = transactionChangeDtos;
    }

    /**
     * @return the transfertList
     */
    public List<TransfertInterCaisse> getTransfertList() {
        return transfertList;
    }

    /**
     * @param transfertList
     * the transfertList to set
     */
    public void setTransfertList(List<TransfertInterCaisse> transfertList) {
        this.transfertList = transfertList;
    }

    /**
     * @return the transferts
     */
    public List<TransfertInterCaisse> getTransferts() {
        return transferts;
    }

    /**
     * @param transferts
     * the transferts to set
     */
    public void setTransferts(List<TransfertInterCaisse> transferts) {
        this.transferts = transferts;
    }

    public String getCodeoc() {
        return codeoc;
    }

    public void setCodeoc(String codeoc) {
        this.codeoc = codeoc;
    }

    /**
     * @return the sasChangeur
     */
    public SasUser getSasChangeur() {
        return sasChangeur;
    }

    /**
     * @param sasChangeur
     * the sasChangeur to set
     */
    public void setSasChangeur(SasUser sasChangeur) {
        this.sasChangeur = sasChangeur;
    }

    public String getNumeroCaisse() {
        return numeroCaisse;
    }

    public void setNumeroCaisse(String numeroCaisse) {
        this.numeroCaisse = numeroCaisse;
    }

    /**
     * @return the caisseDto
     */
    public CaisseDto getCaisseDto() {
        return caisseDto;
    }

    /**
     * @param caisseDto
     * the caisseDto to set
     */
    public void setCaisseDto(CaisseDto caisseDto) {
        this.caisseDto = caisseDto;
    }

    /**
     * @return the typeOperation
     */
    public TypeOperation getTypeOperation() {
        return typeOperation;
    }

    /**
     * @param typeOperation
     * the typeOperation to set
     */
    public void setTypeOperation(TypeOperation typeOperation) {
        this.typeOperation = typeOperation;
    }

    /**
     * @return the intermediaireAgrees
     */
    public List<IntermediaireAgree> getIntermediaireAgrees() {
        return intermediaireAgrees;
    }

    /**
     * @param intermediaireAgrees the intermediaireAgrees to set
     */
    public void setIntermediaireAgrees(List<IntermediaireAgree> intermediaireAgrees) {
        this.intermediaireAgrees = intermediaireAgrees;
    }

    /**
     * @return the filterIA
     */
    public FilterIA getFilterIA() {
        return filterIA;
    }

    /**
     * @param filterIA the filterIA to set
     */
    public void setFilterIA(FilterIA filterIA) {
        this.filterIA = filterIA;
    }

    /**
     * @return the intermediaireAgree
     */
    public IntermediaireAgree getIntermediaireAgree() {
        return intermediaireAgree;
    }

    /**
     * @param intermediaireAgree the intermediaireAgree to set
     */
    public void setIntermediaireAgree(IntermediaireAgree intermediaireAgree) {
        this.intermediaireAgree = intermediaireAgree;
    }

    /**
     * @return the margeDevises
     */
    public List<MargeDeviseDto> getMargeDevises() {
        return margeDevises;
    }

    /**
     * @param margeDevises the margeDevises to set
     */
    public void setMargeDevises(List<MargeDeviseDto> margeDevises) {
        this.margeDevises = margeDevises;
    }

    /**
     * @return the paramTauxModifs
     */
    public List<Paramtauxmodif> getParamTauxModifs() {
        return paramTauxModifs;
    }

    /**
     * @param paramTauxModifs the paramTauxModifs to set
     */
    public void setParamTauxModifs(List<Paramtauxmodif> paramTauxModifs) {
        this.paramTauxModifs = paramTauxModifs;
    }

    public ForcageCaisse getForcageCaisse() {
        return forcageCaisse;
    }

    public void setForcageCaisse(ForcageCaisse forcageCaisse) {
        this.forcageCaisse = forcageCaisse;
    }

    public List<MargeHistorique> getMargeHistos() {
        return margeHistos;
    }

    public void setMargeHistos(List<MargeHistorique> margeHistos) {
        this.margeHistos = margeHistos;
    }

    /**
     * @return the mvtComptable
     */
    public MvtComptable getMvtComptable() {
        return mvtComptable;
    }

    /**
     * @param mvtComptable the mvtComptable to set
     */
    public void setMvtComptable(MvtComptable mvtComptable) {
        this.mvtComptable = mvtComptable;
    }

    /**
     * @return the mvtComptableInput
     */
    public MvtComptableInput getMvtComptableInput() {
        return mvtComptableInput;
    }

    /**
     * @param mvtComptableInput the mvtComptableInput to set
     */
    public void setMvtComptableInput(MvtComptableInput mvtComptableInput) {
        this.mvtComptableInput = mvtComptableInput;
    }

    /**
     * @return the mvtComptables
     */
    public List<MvtComptable> getMvtComptables() {
        return mvtComptables;
    }

    /**
     * @param mvtComptables the mvtComptables to set
     */
    public void setMvtComptables(List<MvtComptable> mvtComptables) {
        this.mvtComptables = mvtComptables;
    }

    /**
     * @return the mvtComptableAchats
     */
    public List<LigneMvtComptablePdf> getMvtComptableAchats() {
        return mvtComptableAchats;
    }

    /**
     * @param mvtComptableAchats the mvtComptableAchats to set
     */
    public void setMvtComptableAchats(List<LigneMvtComptablePdf> mvtComptableAchats) {
        this.mvtComptableAchats = mvtComptableAchats;
    }

    /**
     * @return the mvtComptableVentes
     */
    public List<LigneMvtComptablePdf> getMvtComptableVentes() {
        return mvtComptableVentes;
    }

    /**
     * @param mvtComptableVentes the mvtComptableVentes to set
     */
    public void setMvtComptableVentes(List<LigneMvtComptablePdf> mvtComptableVentes) {
        this.mvtComptableVentes = mvtComptableVentes;
    }

    /**
     * @return the mvtComptableNets
     */
    public List<LigneMvtComptablePdf> getMvtComptableNets() {
        return mvtComptableNets;
    }

    /**
     * @param mvtComptableNets the mvtComptableNets to set
     */
    public void setMvtComptableNets(List<LigneMvtComptablePdf> mvtComptableNets) {
        this.mvtComptableNets = mvtComptableNets;
    }

    public BigDecimal getSommeCvEsp() {
        return sommeCvEsp;
    }

    public void setSommeCvEsp(BigDecimal sommeCvEsp) {
        this.sommeCvEsp = sommeCvEsp;
    }

    public List<DotationDossier> getDotationDossiers() {
        return dotationDossiers;
    }

    public void setDotationDossiers(List<DotationDossier> dotationDossiers) {
        this.dotationDossiers = dotationDossiers;
    }

    public List<DotationTransaction> getDotationTransactions() {
        return dotationTransactions;
    }

    public void setDotationTransactions(List<DotationTransaction> dotationTransactions) {
        this.dotationTransactions = dotationTransactions;
    }

    public DotationDossier getDotationDossier() {
        return dotationDossier;
    }

    public void setDotationDossier(DotationDossier dotationDossier) {
        this.dotationDossier = dotationDossier;
    }

    public DotationTransaction getDotationTransaction() {
        return dotationTransaction;
    }

    public void setDotationTransaction(DotationTransaction dotationTransaction) {
        this.dotationTransaction = dotationTransaction;
    }

    public DotationFilter getDotationFilter() {
        return dotationFilter;
    }

    public void setDotationFilter(DotationFilter dotationFilter) {
        this.dotationFilter = dotationFilter;
    }

    public ParamTech getParamTech() {
        return paramTech;
    }

    public void setParamTech(ParamTech paramTech) {
        this.paramTech = paramTech;
    }

    public DotationNote getDotationNote() {
        return dotationNote;
    }

    public void setDotationNote(DotationNote dotationNote) {
        this.dotationNote = dotationNote;
    }

    public List<DotationNote> getDotationNotes() {
        return dotationNotes;
    }

    public void setDotationNotes(List<DotationNote> dotationNotes) {
        this.dotationNotes = dotationNotes;
    }

    public void setSopInsertInput(SopInsertInput sopInsertInput) {
        this.sopInsertInput = sopInsertInput;

    }

    public SopInsertInput getSopInsertInput() {
        return sopInsertInput;
    }

    public SopUpdateOutput getSopUpdateOutput() {
        return sopUpdateOutput;
    }

    public void setSopUpdateOutput(SopUpdateOutput sopUpdateOutput) {
        this.sopUpdateOutput = sopUpdateOutput;
    }

    public OperationRVDevise getOperationRVDevise() {
        return operationRVDevise;
    }

    public void setOperationRVDevise(OperationRVDevise operationRVDevise) {
        this.operationRVDevise = operationRVDevise;
    }

    public List<LabelValue> getTypeDocs() {
        return typeDocs;
    }

    public void setTypeDocs(List<LabelValue> typeDocs) {
        this.typeDocs = typeDocs;
    }



    public OperationRVDeviseFilter getOperationRVDeviseFilter() {
        return operationRVDeviseFilter;
    }

    public void setOperationRVDeviseFilter(OperationRVDeviseFilter operationRVDeviseFilter) {
        this.operationRVDeviseFilter = operationRVDeviseFilter;
    }

    public List<OperationRVDevise> getOperationRVDevises() {
        return operationRVDevises;
    }

    public void setOperationRVDevises(List<OperationRVDevise> operationRVDevises) {
        this.operationRVDevises = operationRVDevises;
    }

    public List<OperationRVDeviseCndStd> getOperationRVDeviseCndStds() {
        return operationRVDeviseCndStds;
    }

    public void setOperationRVDeviseCndStds(List<OperationRVDeviseCndStd> operationRVDeviseCndStds) {
        this.operationRVDeviseCndStds = operationRVDeviseCndStds;
    }

    public OperationRVDeviseCndStdFilter getOperRVDeviseCndStdFilter() {
        return operRVDeviseCndStdFilter;
    }

    public void setOperRVDeviseCndStdFilter(OperationRVDeviseCndStdFilter operRVDeviseCndStdFilter) {
        this.operRVDeviseCndStdFilter = operRVDeviseCndStdFilter;
    }

    public OperationRVDeviseCndStdClt getOperationRVDeviseCndStdClt() {
        return operationRVDeviseCndStdClt;
    }

    public void setOperationRVDeviseCndStdClt(OperationRVDeviseCndStdClt operationRVDeviseCndStdClt) {
        this.operationRVDeviseCndStdClt = operationRVDeviseCndStdClt;
    }

    public TransactionGAD getTransactionGAD() {
        return transactionGAD;
    }

    public void setTransactionGAD(TransactionGAD transactionGAD) {
        this.transactionGAD = transactionGAD;
    }

    public String getCodeRetour() {
        return codeRetour;
    }

    public void setCodeRetour(String codeRetour) {
        this.codeRetour = codeRetour;
    }

    public String getMessageRetour() {
        return messageRetour;
    }

    public void setMessageRetour(String messageRetour) {
        this.messageRetour = messageRetour;
    }

    public TransactionKYC getTransactionKYC() {
        return transactionKYC;
    }

    public void setTransactionKYC(TransactionKYC transactionKYC) {
        this.transactionKYC = transactionKYC;
    }

    public List<TransactionKYC> getTransactionsKYC() {
        return transactionsKYC;
    }

    public void setTransactionsKYC(List<TransactionKYC> transactionsKYC) {
        this.transactionsKYC = transactionsKYC;
    }

    public TransactionKYCFilter getFilterKyc() {
        return filterKyc;
    }

    public void setFilterKyc(TransactionKYCFilter filterKyc) {
        this.filterKyc = filterKyc;
    }


    public TransactionCashAdvance getTransactionCashAdv() {
        return transactionCashAdv;
    }

    public void setTransactionCashAdv(TransactionCashAdvance transactionCashAdv) {
        this.transactionCashAdv = transactionCashAdv;
    }

    public List<TransactionCashAdvance> getTransactionCashAdvs() {
        return transactionCashAdvs;
    }

    public void setTransactionCashAdvs(List<TransactionCashAdvance> transactionCashAdvs) {
        this.transactionCashAdvs = transactionCashAdvs;
    }

    public TransactionOCR getTransactionOCR() {
        return transactionOCR;
    }

    public void setTransactionOCR(TransactionOCR transactionOCR) {
        this.transactionOCR = transactionOCR;
    }

    public String getCodePays() {
        return codePays;
    }

    public void setCodePays(String codePays) {
        this.codePays = codePays;
    }

    public Pays getPays() {
        return Pays;
    }

    public void setPays(Pays pays) {
        Pays = pays;
    }










    //modif by amina



 /*public DossierIrregulier getDossierIrregulier() {
 return dossierIrregulier;
 }

 public void setDossierIrregulier(DossierIrregulier dossierIrregulier) {
 this.dossierIrregulier = dossierIrregulier;
 }
 */







}
